package logic;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import logic.DrawingBoard;

public class UserInterface implements Runnable {
	private SolarSystem solarSystem;
    private JFrame frame;
    private DrawingBoard board;

    public UserInterface(SolarSystem solarSystem) {
    	this.solarSystem = solarSystem;
    }

    @Override
    public void run() {
        frame = new JFrame("Solar System");
        int width = 800;
        int height = 800;

        frame.setPreferredSize(new Dimension(width, height));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    public void createComponents(Container container) {
        // Create drawing board first which then is added into container-object.
        // After this, create keyboard listener which is added into frame-object
        board = new DrawingBoard(solarSystem);
        container.add(board);
        
        //frame.addKeyListener(new KeyboardListener(game.getWorm()));
    }


    public JFrame getFrame() {
        return frame;
    }
    
    public Updatable getUpdatable() {
        return board;
    }
}