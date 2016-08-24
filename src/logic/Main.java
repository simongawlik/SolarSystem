package logic;

import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		
		SolarSystem solarSystem = new SolarSystem(new Star(100, 100, 25));
		 
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
