/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gltest;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author j
 */
public class GameObject {
    protected Integer x, y;
    protected ArrayList<Integer> coordinates = new ArrayList();
    protected ArrayList<Integer> velocity = new ArrayList();
    
    /**
     * @return integer array of length 2 containing x & y values
     */
    public ArrayList<Integer> getCoordinates() {
        return coordinates;
    }
    
    /**
     * @param coordinates: integer array containing 2 values to set x & y to
     */
    public void setCoordinates(ArrayList<Integer> coordinates) {
        this.coordinates = coordinates;
    }
    
    /**
     * @return:
     */
    public ArrayList<Integer> getVelocity() {
        return velocity;
    }
    
    /**
     * @return:
     */
    public Integer getVelocityX() {
        return velocity.get(0);
    }
    
    /**
     * @return: 
     */
    public Integer getVelocityY() {
        return velocity.get(1);
    }
    
    /**
     * @param velocity: integer array containing values for x & y velocities
     */
    public void setVelocity(ArrayList<Integer> velocity) {
        this.velocity = velocity;
    }
    
    /**
     * 
     */
    public void setX(Integer x) {
        this.x = x;
        this.coordinates.set(0, x);
//        this.velocity.set(0, x);
    }
    
    /**
     * 
     */
    public void setY(Integer y) {
        this.y = y;
        this.coordinates.set(0, y);
//        this.velocity.set(1, y);
    }
    
    /**
     * 
     */
    public Integer getX() {
        return x;
    }
    
    /**
     * 
     */
    public Integer getY() {
        return y;
    }
}
