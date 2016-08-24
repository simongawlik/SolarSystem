package logic;

import java.awt.Color;

public class Planet extends CelestialObject {
	private int radius;
	private Color color;
	// private int mass;
	
	public Planet(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
		this.color = Color.BLUE;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public Color getColor() {
		return color;
	}
	
	
}
