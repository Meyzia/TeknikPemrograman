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
public class Commission extends Hourly{
    private double totalSales;
    private double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double cRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        
        commissionRate = cRate;
    }
    
    public void addSales(double moreSales){
        totalSales += moreSales;
    }

    @Override
    public double pay() {
        double payment = super.pay() + (totalSales*commissionRate);
        totalSales = 0;
        
        return payment;
    }

    @Override
    public String toString() {
        String result = super.toString();
        
        result += "\nTotal sales: "+totalSales;
        return result;
    }
    
    
}
