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
abstract public class StaffMember {
    protected String name;
    protected String address;
    protected String phone;

    public StaffMember(String eName, String eAddress, String ePhone) {
        name = eName;
        address = eAddress;
        phone = ePhone;
    }
    
    public String toString(){
        String result = "Name: "+name+"\n";
        
        result += "Adress: "+address+"\n";
        result += "Phone: "+phone;
        
        return result;
    }
    
    public abstract double pay();
}