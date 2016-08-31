package logic;

public class PVector {
	private double x;
	private double y;
	
	public PVector(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return (int)x;
	}
	
	public int getY() {
		return (int)y;
	}
	
	public PVector add(PVector other) {
		return new PVector(x + other.getX(), y + other.getY());
	}
	
	public PVector subtract(PVector other) {
		return new PVector(x - other.getX(), y - other.getY());
	}
	
	public PVector mult(double scalar) {
		return new PVector(x * scalar, y * scalar);
	}
	
	@Override
	public String toString() {
		return "x: " + getX() + "; y: " + getY();
	}
}
