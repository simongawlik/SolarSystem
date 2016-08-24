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
        graphics.fillOval(solarSystem.getSun().getX(), solarSystem.getSun().getY(), 
        		solarSystem.getSun().getRadius() * 2, solarSystem.getSun().getRadius() * 2);
        
        //graphics.setColor(Color.RED);
        
    } 
    
    @Override
    public void update() {
        super.repaint();
    }
}
