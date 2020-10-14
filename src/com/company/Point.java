package com.company;

/** 
 * A simple unmodifiable <code>Point</code> class.
 * Point objects can be scaled and translated.
 * @author hlindenau
 * @version 0.0
 */

public final class Point{

    /**
     * X coordinate
     */
    private float x;
    /**
     * Y coordinate
     */
    private float y;

    Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    //Default constructor
    Point(){
        this.x = 0;
        this.y = 0;
    }


    /**
     * Translate point by a (x,y) vector
     * @param x value added to Point's current x 
     * @param y value added to Point's current y 
     * @return <code>Point</code> object with changed x and y values
     */
    public Point translate(float x, float y){
        this.x += x;
        this.y += y;
        return this;
    }

    /**
     * Multiply coordinates by given value
     * @param s scaling value
     * @return <code>Point</code> object scaled by s value
     */
    public Point scale(float s){
        this.x *= s;
        this.y *= s;
        return this;
    }


    /**
     * Translate point by a (x,y) vector (modifying method)
     * @see com.company.Point#translate(float, float) 
     */
    public void translate_modify(float x, float y){
        this.x += x;
        this.y += y;
    }

    /**
     * Multiply coordinates by given value (modifying method)
     * @see com.company.Point#scale(float) 
     */
    public void scale_modify(float s){
        this.x *= s;
        this.y *= s;
    }

    //Getters
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    //Setters
    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

}
