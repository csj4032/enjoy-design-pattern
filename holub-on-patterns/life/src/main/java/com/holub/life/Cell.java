package com.holub.life;

import java.awt.*;

public interface Cell {

	boolean figureNextState(Cell north, Cell south, Cell east, Cell west, Cell northeast, Cell northwest, Cell southeast, Cell southwest);

	Cell edge(int row, int column);

	boolean transition();

	void redraw(Graphics g, Rectangle here, boolean drawAll);

	void userClicked(Point here, Rectangle surface);

	boolean isAlive();

	int widthInCells();

	Cell create();

	Direction isDisruptiveTo();

	void clear();

	interface Memnto extends Storable {
		void markAsAlive(Point location);

		boolean isAlive(Point location);
	}

	boolean transfer(Storable memento, Point upperLeftCorner, boolean doLoad);

	public static boolean STORE = false;
	public static boolean LOAD = true;

	Storable createMemento();


	public static final Cell DUMMY = new Cell() {
		public boolean figureNextState(Cell n, Cell s, Cell e, Cell w,
									   Cell ne, Cell nw, Cell se, Cell sw) {
			return true;
		}

		public Cell edge(int r, int c) {
			return this;
		}

		public boolean isAlive() {
			return false;
		}

		public Cell create() {
			return this;
		}

		public Direction isDisruptiveTo() {
			return Direction.NONE;
		}

		public void clear() {
		}

		public int widthInCells() {
			return 0;
		}

		public boolean transition() {
			return false;
		}

		public void userClicked(Point h, Rectangle s) {
		}

		public void redraw(Graphics g, Rectangle here,
						   boolean drawAll) {
		}

		public boolean transfer(Storable m, Point ul, boolean load) {
			return false;
		}

		public Storable createMemento() {
			throw new UnsupportedOperationException("Cannot create memento of dummy block");
		}
	};
}
