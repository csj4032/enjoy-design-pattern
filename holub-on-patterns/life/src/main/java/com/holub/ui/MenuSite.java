package com.holub.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class MenuSite {

	private static JFrame menuFrame = null;
	private static JMenuBar menuBar = null;
	private static Map requesters = new HashMap();
	private static Properties nameMap;
	private static Pattern shortcutExtractor = Pattern.compile("\\s*([^;]+?)\\s*" + "(;\\s*([^\\s].*?))?\\s*$");
	private static Pattern submenuExtractor = Pattern.compile("(.*?)(?::(.*?))?" + "(?::(.*?))?" + "(?::(.*?))?" + "(?::(.*?))?" + "(?::(.*?))?" + "(?::(.*?))?");
	private static final LinkedList menuBarContents = new LinkedList();

	private MenuSite() {
	}

	private static boolean valid() {
		assert menuFrame != null : "MenuSite not established";
		assert menuBar != null : "MenuSite not established";
		return true;
	}

	public static void establish(JFrame container) {
		assert container != null;
		assert menuFrame == null : "Tried to establish more than one MenuSite";

		menuFrame = container;
		menuFrame.setJMenuBar(menuBar = new JMenuBar());

		assert valid();
	}

	public static void addMenu(Object requester, String menuSpecifier) {
		createSubmenuByName(requester, menuSpecifier);
	}

	public static void addLine(Object requester, String toThisMenu, String name, ActionListener listener) {
		Component element;
	}

	private static JMenu createSubmenuByName(Object requester, String menuSpecifier) {

		Matcher m = submenuExtractor.matcher(menuSpecifier);
		if (!m.matches()) {
			throw new IllegalArgumentException("Malformed menu specifier");
		}

		JMenuItem child = null;
		MenuElement parent = menuBar;
		String childName;

		for (int i = 1; (childName = m.group(i++)) != null; parent = child) {
			child = getSubmenuByName(childName, parent.getSubElements());

			if (child != null) {
				if (!(child instanceof JMenu)) throw new IllegalArgumentException("Specifier identifes line item, not menu.");
			} else {
				child = new JMenu(childName);
				child.setName(childName);
				setLabelAndShortcut(child);

				Item item = new Item(child, parent, menuSpecifier);
				menusAddedBy(requester).add(item);
				item.attachYourselfToYourParent();
			}

		}

		return (JMenu) child;
	}

	private static JMenuItem getSubmenuByName(String name, MenuElement[] contents) {
		JMenuItem found = null;
		return found;
	}

	private static void setLabelAndShortcut(JMenuItem item) {

	}

	private static Collection menusAddedBy(Object requester) {
		Collection menus = (Collection) requesters.get(requester);
		return menus;
	}

	private static final class Item {
		private Component item;
		private String parentSpecification;
		private MenuElement parent;
		private boolean isHelpMenu;

		private boolean valid() {
			assert item != null : "item is null";
			assert parent != null : "paremt is null";
			return true;
		}

		public Item(Component item, MenuElement parent, String parentSpecification) {

		}

		public final void attachYourselfToYourParent() {

		}
	}
}