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
public class Visitor {
    String Name;
    AccessCard card;

    public Visitor(String Name) {
        this.Name = Name;
    }
    
    void rechargeCard(AccessCard card,int rechargeAmount){
        card.recharge(rechargeAmount);
    }
    
    void enterLabyrinth(AccessCard card){
        card.min(50);
    }
            
    void printInfo(AccessCard card){
        System.out.println("Visitor name : "+this.Name);
        card.printCardInfo();
    }
    
   
}
