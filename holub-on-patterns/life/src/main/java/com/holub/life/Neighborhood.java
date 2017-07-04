package com.holub.life;

import com.holub.asynch.ConditionVariable;

import java.awt.*;

public final class Neighborhood implements Cell {

	private static final ConditionVariable readingPermitted = new ConditionVariable(true);

	private boolean amActive = false;
	private final Cell[][] grid;
	private final int gridSize;

	public Neighborhood(int gridSize, Cell prototype) {
		this.gridSize = gridSize;
		this.grid = new Cell[gridSize][gridSize];

		for (int row = 0; row < gridSize; ++row) {
			for (int column = 0; column < gridSize; ++column) {
				grid[row][column] = prototype.create();
			}
		}
	}

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
		return true;
	}

	@Override
	public int widthInCells() {
		return gridSize * grid[0][0].widthInCells();
	}

	@Override
	public Cell create() {
		return new Neighborhood(gridSize, grid[0][0]);
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
