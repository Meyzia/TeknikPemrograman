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
public class Square extends Rectangle{

    public Square(double side) {
        super(side,side);
    }
    
    @Override
    public void setWidth(double side){
        super.setWidth(side);
    }
    public void setLength(double side){
        super.setLength(side);
    }
    
    @Override
    public String toString(){
        return "A Square with side="+super.getLength()
                +", which is a subclass of "+super.toString();
    }
}
