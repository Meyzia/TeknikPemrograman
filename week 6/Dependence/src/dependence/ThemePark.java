/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dependence;

/**
 *
 * @author lenovo
 */
public class ThemePark {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Visitor v1 = new Visitor("Mey");
        AccessCard c1 = new AccessCard("01002",100);
        
        v1.rechargeCard(c1,20);
        v1.printInfo(c1);
        
        v1.enterLabyrinth(c1);
        v1.printInfo(c1);
    }
    
}
