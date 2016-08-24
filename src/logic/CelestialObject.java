package logic;

public class CelestialObject {
	private PVector position;
	//private int mass;
	
	public CelestialObject(double x, double y) {
		this.position = new PVector(x, y);
	}
	
	public PVector getPosition() {
		return position;
	}
	
	public void setPosition(PVector newPosition) {
		this.position = newPosition;
	}
	
	public double distanceFrom(CelestialObject other) {
		double distanceX = this.position.getX() - other.position.getX();
		double distanceY = this.position.getY() - other.position.getY();
		return Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2));
	}
	
//	public int getMass() {
//	return mass;
//}
}
