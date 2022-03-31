/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

/**
 *
 * @author lenovo
 */
public class Circle extends Shape{
    // private instance variable, not accessible from outside this class
    private double radius;
    
    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle() { // 1st (default) constructor
        radius = 1.0;
    }

    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double r) { // 2nd constructor
        radius = r;
    }

    public Circle(double r, String c, boolean f) {
        radius = r;
        super.setColor(c);
        super.setFilled(f);
    }
    
    public void setRadius(double r){
        this.radius=r;
    }
    /** Returns the radius */
    public double getRadius() {
        return radius;
    }

    /** Returns the area of this Circle instance */
    public double getArea() {
        return radius*radius*Math.PI;
    }
    
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    
    /** Return a self-descriptive string of this instance in the form of
   Circle[radius=?,color=?] */
    public String toString() {
        return "A circle with radius " + radius +", whixh is a subclass of "+super.toString();
    }
}
