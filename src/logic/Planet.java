package logic;

import java.awt.Color;

public class Planet extends CelestialObject {
	private Star orbitingStar;
	private double radius;
	private Color color;
	private PVector velocity;
	public double G = 6.7408E-11;
	private double mass;
	
	public Planet(double x, double y, double velocityX, double velocityY, double radius, double mass, Star sun) {
		super(x, y);
		velocity = new PVector(velocityX, velocityY);
		this.radius = radius;
		this.color = Color.BLUE;
		this.orbitingStar = sun;
		this.mass = mass;
	}
	
	public double getMass() {
		return mass;
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
		// this doesn't seem to work. need to figure out scaling
		System.out.println(this.getPosition());
		//System.out.println(Math.pow(this.distanceFrom(orbitingStar), 3));
		PVector F = this.getPosition().mult(G * this.mass * orbitingStar.getMass() / 1E9 / Math.pow(this.distanceFrom(orbitingStar), 2));
		
		
		
		velocity = velocity.add(F);
		this.setPosition(this.getPosition().add(velocity));
	}
	
}
