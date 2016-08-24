package logic;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class DrawingBoard extends JPanel implements Updatable {
    
    private SolarSystem solarSystem;
    
    public DrawingBoard(SolarSystem solarSystem) {
        this.solarSystem = solarSystem;
    }
    
    @Override
    protected void paintComponent(Graphics graphics) {
    	super.paintComponent(graphics);
    	
        graphics.setColor(solarSystem.getSun().getColor());
        graphics.fillOval(solarSystem.getSun().getPosition().getX(), solarSystem.getSun().getPosition().getY(), 
        		solarSystem.getSun().getRadius() * 2, solarSystem.getSun().getRadius() * 2);
        
        for (Planet planet : solarSystem.getPlanets()) {
        	graphics.setColor(planet.getColor());
        	graphics.fillOval(planet.getPosition().getX(), planet.getPosition().getY(), 
            		planet.getRadius() * 2, planet.getRadius() * 2);
        }
        	
        
    } 
    
    @Override
    public void update() {
        super.repaint();
    }
}
