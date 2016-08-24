package logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.LinkedList;
import javax.swing.Timer;


public class SolarSystem extends Timer implements ActionListener {
	private Star sun;
	private Updatable updatable;
	private List<Planet> planets;
	
	public SolarSystem(Star sun) {
		super(1000, null);
		this.sun = sun;
		this.planets = new LinkedList<Planet>();
		
		addActionListener(this);
        setInitialDelay(2000);
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
	
	@Override
    public void actionPerformed(ActionEvent ae) {
		for (Planet planet : planets) {
			planet.move();
			System.out.println(planet.getPosition().getX());
		}
		updatable.update();
        setDelay(500);
        
	}
}
