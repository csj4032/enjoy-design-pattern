package com.pearl.genius.command;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener, MouseMotionListener, WindowListener {

	private MacroCommand history = new MacroCommand();
	private DrawCanvas canvas = new DrawCanvas(400, 400, history);
	private JButton clearButton = new JButton("clear");
	private JButton undoButton = new JButton("undo");
	private JButton redButton = new JButton("red");
	private JButton greenButton = new JButton("green");
	private JButton blueButton = new JButton("blue");

	public static void main(String[] args) {
		new Main("Hellow");
	}

	public Main(String title) {
		super(title);

		this.addWindowListener(this);
		canvas.addMouseMotionListener(this);
		clearButton.addActionListener(this);
		undoButton.addActionListener(this);

		redButton.addActionListener(this);
		greenButton.addActionListener(this);
		blueButton.addActionListener(this);

		Box buttonBox = new Box(BoxLayout.X_AXIS);
		buttonBox.add(clearButton);
		buttonBox.add(undoButton);
		buttonBox.add(redButton);
		buttonBox.add(greenButton);
		buttonBox.add(blueButton);

		Box mainBox = new Box(BoxLayout.Y_AXIS);
		mainBox.add(buttonBox);
		mainBox.add(canvas);
		getContentPane().add(mainBox);

		pack();
		show();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == clearButton) {
			history.clear();
			canvas.init();
			canvas.repaint();
		} else if (e.getSource() == undoButton) {
			history.undo();
			canvas.repaint();
		} else if (e.getSource() == redButton) {
			Command cmd = new ColorCommand(canvas, Color.RED);
			history.append(cmd);
			cmd.execute();
		} else if (e.getSource() == greenButton) {
			Command cmd = new ColorCommand(canvas, Color.GREEN);
			history.append(cmd);
			cmd.execute();
		} else if (e.getSource() == blueButton) {
			Command cmd = new ColorCommand(canvas, Color.BLUE);
			history.append(cmd);
			cmd.execute();
		}
	}

	public void mouseDragged(MouseEvent e) {
		Command cmd = new DrawCommand(canvas, e.getPoint());
		history.append(cmd);
		cmd.execute();
	}

	public void mouseMoved(MouseEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public void windowOpened(WindowEvent e) {
	}

	public void windowClosed(WindowEvent e) {
	}

	public void windowIconified(WindowEvent e) {
	}

	public void windowDeiconified(WindowEvent e) {
	}

	public void windowActivated(WindowEvent e) {
	}

	public void windowDeactivated(WindowEvent e) {
	}
}
