package com.holub.life;

import com.holub.io.Files;
import com.holub.ui.MenuSite;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.IOException;

public class Universe extends JPanel {

	private final Cell outermostCell;
	private static final Universe theInstance = new Universe();

	private static final int DEFAULT_GRID_SIZE = 8;
	private static final int DEFAULT_CELL_SIZE = 8;

	private Universe() {
		outermostCell = new Neighborhood(DEFAULT_CELL_SIZE, new Neighborhood(DEFAULT_CELL_SIZE, new Resident()));
		final Dimension PREFERRED_SIZE = new Dimension(outermostCell.widthInCells() * DEFAULT_CELL_SIZE, outermostCell.widthInCells() * DEFAULT_CELL_SIZE);

		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				Rectangle bounds = getBounds();
				bounds.height /= outermostCell.widthInCells();
				bounds.height *= outermostCell.widthInCells();
				bounds.width = bounds.height;
				setBounds(bounds);
			}
		});

		setBackground(Color.white);
		setPreferredSize(PREFERRED_SIZE);
		setMaximumSize(PREFERRED_SIZE);
		setMinimumSize(PREFERRED_SIZE);
		setOpaque(true);

		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Rectangle bounds = getBounds();
				bounds.x = 0;
				bounds.y = 0;
				outermostCell.userClicked(e.getPoint(), bounds);
				repaint();
			}
		});

		MenuSite.addLine(this, "Grid", "Clear", new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outermostCell.clear();
				repaint();
			}
		});

		MenuSite.addLine(this, "Grid", "Load", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				doLoad();
			}
		});
	}

	public static Universe instance() {
		return theInstance;
	}

	private void doLoad() {
		try {
			FileInputStream in = new FileInputStream(Files.userSelected(".", ".life", "Life File", "Load"));
		} catch (IOException theException) {
			JOptionPane.showMessageDialog(null, "Read Failed!", "The Game of Life", JOptionPane.ERROR_MESSAGE);
		}
		repaint();
	}
}
