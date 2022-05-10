package com.javaex.ex04;

public class Point {

	// field
	private int x;
	private int y;

	// constructor
	public Point() {
		super(); // Object()
	}

	public Point(int x, int y) {
		super(); // Object()
		this.x = x;
		this.y = y;
	}

	// method - g/s
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	// method - general
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
