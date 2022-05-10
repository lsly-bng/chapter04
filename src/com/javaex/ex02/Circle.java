package com.javaex.ex02;

public class Circle {

	// field
	private int radius;

	// constructor
	public Circle() {
		super();
	}

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	// method - g/s
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	// method - general
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
