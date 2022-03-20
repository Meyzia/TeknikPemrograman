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
public class AccessCard {
    String CardNumber;
    int balance;

    public AccessCard(String CardNumber, int balance) {
        this.CardNumber = CardNumber;
        this.balance = balance;
    }

    void recharge(int rechargeAmount){
        balance += rechargeAmount;
    }
    
    void min(int min){
        balance -= min;
    }
    
    void printCardInfo(){
        System.out.println("Card Number : "+this.CardNumber);
        System.out.println("Balance : "+this.balance);
    }
}
