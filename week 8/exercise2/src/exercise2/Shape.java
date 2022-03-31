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
public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        color = "green";
        filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    
    public void setFilled(boolean f){
        this.filled=f;
    }
    
    public boolean isFilled(){
        return filled;
    }
    
    public void setColor(String c){
        this.color=c;
    }
    public String getColor(){
        return color;
    }
    
    public String toString(){
        if(filled){
            return "a shape with color "+color+" and filled";
        }else{
            return "a shape with color "+color+" and not filled";
        }
        
    }
}
