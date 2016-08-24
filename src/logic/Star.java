package logic;

import java.awt.Color;

public class Star extends CelestialObject {
	private double radius;
	private Color color;
	
	public Star(double x, double y, double radius) {
		super(x, y);
		this.radius = radius;
		this.color = Color.YELLOW;
	}
	
	public int getRadius() {
		return (int)radius;
	}
	
	public Color getColor() {
		return color;
	}
}
