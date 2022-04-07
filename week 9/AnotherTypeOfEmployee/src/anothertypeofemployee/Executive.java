/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anothertypeofemployee;

/**
 *
 * @author lenovo
 */
public class Executive extends Employee{
    private double bonus;

    public Executive(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate) {
        super(eName, eAddress, ePhone,socSecNumber,rate);
    }
    
    public void awardBonus(double execBonus){
        bonus = execBonus;
    }
    
    @Override
    public double pay(){
        double payment = super.pay()+bonus;
        bonus = 0;
        
        return payment;
    }
}
