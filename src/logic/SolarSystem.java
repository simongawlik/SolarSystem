package logic;

import java.util.List;
import java.util.LinkedList;
import javax.swing.Timer;


public class SolarSystem extends Timer {
	private Star sun;
	private Updatable updatable;
	private List<Planet> planets;
	
	public SolarSystem(Star sun) {
		super(1000, null);
		this.sun = sun;
		this.planets = new LinkedList<Planet>();
	}
	
	public Star getSun() {
		return sun;
	}
	
	public void addPlanet(Planet planet) {
		planets.add(planet);
	}
	
	public List<Planet> getPlanets() {
		return planets;
	}
	
	public void setUpdatable(Updatable updatable) {
		this.updatable = updatable;
	}
}
