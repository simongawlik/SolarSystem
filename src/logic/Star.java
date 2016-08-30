package logic;

import java.awt.Color;

public class Star extends CelestialObject {
	private double radius;
	private Color color;
	private double mass;
	
	public Star(double x, double y, double radius, double mass) {
		super(x, y);
		this.radius = radius;
		this.color = Color.YELLOW;
		this.mass = mass;
	}
	
	public int getRadius() {
		return (int)radius;
	}
	
	public Color getColor() {
		return color;
	}
	
	public double getMass() {
		return mass;
	}
}
