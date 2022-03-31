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
public class Test {
    public static void main(String[] args) {
        Square s=new Square(2);
        System.out.println(s.toString());
        
        Circle c=new Circle(7, "blue", true);
        System.out.println(c.toString());
        
        Rectangle r=new Rectangle(12, 6, "yellow", false);
        System.out.println(r.toString());
    }
}
