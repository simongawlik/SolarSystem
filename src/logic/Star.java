package logic;

import java.awt.Color;

public class Star extends CelestialObject {
	private int radius;
	private Color color;
	
	public Star(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
		this.color = Color.YELLOW;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public Color getColor() {
		return color;
	}
}
