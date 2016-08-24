package logic;

import java.awt.Color;

public class Planet extends CelestialObject {
	private Star orbitingStar;
	private double radius;
	private Color color;
	private PVector velocity;
	public double G = 100;
	// private int mass;
	
	public Planet(double x, double y, double velocityX, double velocityY, double radius, Star sun) {
		super(x, y);
		velocity = new PVector(velocityX, velocityY);
		this.radius = radius;
		this.color = Color.BLUE;
		this.orbitingStar = sun;
	}
	
	public PVector getVelocity() {
		return velocity;
	}
	
	public void setVelocity(PVector newVelocity) {
		velocity = newVelocity;
	}
	
	public int getRadius() {
		return (int)radius;
	}
	
	public Color getColor() {
		return color;
	}
	
	
	public void move() {
		PVector F = this.getPosition().mult(-G / Math.pow(this.distanceFrom(orbitingStar), 2));
		
		velocity = velocity.add(F);
		this.setPosition(this.getPosition().add(velocity));
	}
	
}
