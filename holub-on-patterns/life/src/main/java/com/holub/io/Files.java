package com.holub.io;

import javax.swing.*;
import java.io.File;
import javax.swing.filechooser.FileFilter;
import java.io.FileNotFoundException;

public class Files {

	public static File userSelected(final String startHere, final String extension, final String description, final String selectButtonText) throws FileNotFoundException {

		FileFilter filter =
				new FileFilter() {
					public boolean accept(File f) {
						return f.isDirectory()
								|| (extension != null
								&& f.getName().endsWith(extension));
					}

					public String getDescription() {
						return description;
					}
				};

		JFileChooser chooser = new JFileChooser(startHere);
		chooser.setFileFilter(filter);

		int result = chooser.showDialog(null, selectButtonText);
		if (result == JFileChooser.APPROVE_OPTION) return chooser.getSelectedFile();

		throw new FileNotFoundException("No file selected by user");
	}
}
