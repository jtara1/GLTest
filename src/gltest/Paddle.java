/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gltest;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;

/**
 *
 * @author j
 */
public class Paddle extends GameObject {
    
//    private int x, y;
//    private int[] coordinates;
    private int height, width;
//    private int[] velocity;
    
    public Paddle(Dimension frame_dim, Insets insets) {
        int fixed_vert_offset = 10;
        
        width = 150;
        height = 20;
        
        x = (int) (frame_dim.getWidth() / 2) - width / 2;
        y = (int) (frame_dim.getHeight()) - height - insets.top - fixed_vert_offset;
        coordinates.add(x);
        coordinates.add(y);
        
        velocity.add(12);
        velocity.add(0);
    }
    
    /**
     * @param bbg: Graphics object to draw on
     */
    public void draw(Graphics bbg) {
        bbg.drawRect(x, y, width, height);
    }
    
    /**
     * Return width
     */
    public int getWidth() {
        return width;
    }
    
    /**
     * Return height
     */
    public int getHeight() {
        return height;
    }
}
