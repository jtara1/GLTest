/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gltest;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author j
 */
public class Ball extends GameObject {
    
//    private int x, y;
//    private int[] coordinates;
    private final int radius, diameter;
//    private int[] velocity;
    
    /**
     * @param frame_dim: Dimensions of frame
     */
    public Ball(Dimension frame_dim) {
        radius = 20;
        diameter = radius * 2;
        
        x = (int) (frame_dim.getWidth() / 2) - diameter;
        y = (int) (frame_dim.getHeight() / 2) - diameter;
        coordinates.add(x);
        coordinates.add(y);
        
        Random rand = new Random();
        int multiplierX = 1, multiplierY = 1;
        if (rand.nextInt(1) == 0) {
            multiplierX = -1;
        }
        if (rand.nextInt(1) == 0) {
            multiplierY = -1;
        }
        
        velocity.add(rand.nextInt(2) + 6 * multiplierX);
        velocity.add(rand.nextInt(2) + 6 * multiplierY);
    }
    
    /**
     * @param bbg: Graphics object to draw on
     */
    public void draw(Graphics bbg) {
        bbg.drawOval(x, y, diameter, diameter);
    }
    
    /**
     * @param wall: String name of the wall
     */
    public void reflect(String wall) {
        if (wall.equalsIgnoreCase("left") || wall.equalsIgnoreCase("right")) {
            velocity.set(0, velocity.get(0) * -1);
        }
        else if (wall.equalsIgnoreCase("top") || wall.equalsIgnoreCase("bottom")) {
            velocity.set(1, velocity.get(1) * -1);
        }
    }
    
    /**
     * @return: integer radius
     */
    public int getRadius() {
        return radius;
    }
    
    /**
     * @return integer diameter
     */
    public int getDiameter() {
        return diameter;
    }
}
