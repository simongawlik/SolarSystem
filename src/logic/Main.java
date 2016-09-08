package logic;

import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		double MASS_EARTH = 5.97219E24;
		double MASS_SUN = 1.9891E30;
		
		// start solar system with sun
		Star sun = new Star(400, 400, 20, MASS_SUN);
		SolarSystem solarSystem = new SolarSystem(sun);
		
		// add planets to the system
		solarSystem.addPlanet(new Planet(400, 250, -26, 0, 5, MASS_EARTH, sun));
		
        UserInterface ui = new UserInterface(solarSystem);
        SwingUtilities.invokeLater(ui);
 
        while (ui.getUpdatable() == null) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println("The drawing board hasn't been created yet.");
            }
        }
 
        solarSystem.setUpdatable(ui.getUpdatable());
        solarSystem.start();
	}

}
