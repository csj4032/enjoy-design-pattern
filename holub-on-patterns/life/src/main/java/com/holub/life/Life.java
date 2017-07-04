package com.holub.life;

import java.awt.*;
import javax.swing.*;
import com.holub.ui.MenuSite;

public class Life extends JFrame {

	public static void main(String[] args) {
		new Life();
	}

	private Life() {
		super("The Game of Life");
		MenuSite.establish(this);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(Universe.instance(), BorderLayout.CENTER);

		pack();
		setVisible(true);
	}
}