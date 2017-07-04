package com.holub.life;

import com.holub.ui.Colors;

import java.awt.*;

public class Resident implements Cell {

	private static final Color BORDER_COLOR = Colors.DARK_YELLOW;
	private static final Color LIVE_COLOR 	= Color.RED;
	private static final Color DEAD_COLOR   = Colors.LIGHT_YELLOW;

	private boolean amAlive 	= false;
	private boolean willBeAlive	= false;

	@Override
	public boolean figureNextState(Cell north, Cell south, Cell east, Cell west, Cell northeast, Cell northwest, Cell southeast, Cell southwest) {
		return false;
	}

	@Override
	public Cell edge(int row, int column) {
		return null;
	}

	@Override
	public boolean transition() {
		return false;
	}

	@Override
	public void redraw(Graphics g, Rectangle here, boolean drawAll) {

	}

	@Override
	public void userClicked(Point here, Rectangle surface) {

	}

	@Override
	public boolean isAlive() {
		return amAlive;
	}

	@Override
	public int widthInCells() {
		return 1;
	}

	@Override
	public Cell create() {
		return new Resident();
	}

	@Override
	public Direction isDisruptiveTo() {
		return null;
	}

	@Override
	public void clear() {

	}

	@Override
	public boolean transfer(Storable memento, Point upperLeftCorner, boolean doLoad) {
		return false;
	}

	@Override
	public Storable createMemento() {
		return null;
	}
}
