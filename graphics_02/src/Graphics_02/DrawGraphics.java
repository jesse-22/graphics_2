package Graphics_02;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    Bouncer movingSprite;
    Bouncer movingSprite2;
    ArrayList<Bouncer> shapes = new ArrayList<Bouncer>();
    ArrayList<StraightMover> shapes2 = new ArrayList<StraightMover>();

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        Rectangle box = new Rectangle(15, 20, Color.RED);
        
        //** Draw second rectangle
        Bouncer firstSprite = new Bouncer(100,180, box);
        StraightMover firstSprite_s = new StraightMover(1,6, box);
        
        //** Draw circles
        Circle circle = new Circle(25, 30, Color.blue);
        Circle circle2 = new Circle(10, 15, Color.green);
        StraightMover circle_s = new StraightMover(10,25, circle);
        
        firstSprite.setMovementVector(1, 2);
        firstSprite_s.setMovementVector(1, 2);
        movingSprite = new Bouncer(100, 170, box);
        movingSprite.setMovementVector(3, 1);
        Bouncer movingCircle = new Bouncer(55, 80, circle);
        Bouncer movingCircle2 = new Bouncer(20, 15, circle2);
        
        // ** Make the circles bounce off edges
        movingCircle.setMovementVector(2, 5);
        movingCircle2.setMovementVector(1, 7);
        
        //** StraightMover movement
        circle_s.setMovementVector(4, 8);
        
        // ** Add shapes to Bouncer ArrayList */
        shapes.add(firstSprite);
        shapes.add(movingSprite);
        shapes.add(movingCircle);
        shapes.add(movingCircle2);
        
        // ** Add shapes to StraightMover ArrayList
        shapes2.add(firstSprite_s);
        shapes2.add(circle_s);
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
    	for (Bouncer b : shapes) {
    		b.draw(surface);
    	}
    	
    	for (StraightMover a : shapes2) {
    		a.draw(surface);
    	}
    }
}
