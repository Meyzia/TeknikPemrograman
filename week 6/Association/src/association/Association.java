/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package association;

/**
 *
 * @author lenovo
 */

class Client{
    String Name;
    String Case;

    void setName(String _Name){
        this.Name = _Name;
    }
    String getName(){
        return this.Name;
    }
    void setCase(String _Case){
        this.Case = _Case;
    }
    String getCase(){
        return this.Case;
    }
    
}

class Lawyer{
    String Name;
    
    void setName(String _Name){
        this.Name = _Name;
    }
    String getName(){
        return this.Name;
    }
}

public class Association {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lawyer l1 = new Lawyer();
        l1.setName("Hotman Paris");
        
        Client c1 = new Client();
        c1.setName("Kang Sol B");
        c1.setCase("Plagiarism");
        
        Client c2 = new Client();
        c2.setName("Yoo Seung-Jae");
        c2.setCase("Theft");
        
        System.out.println("Lawyer : "+l1.getName());
        System.out.println("Client 1");
        System.out.println("Name : "+c1.getName());
        System.out.println("Case : "+c1.getCase());
        System.out.println("\nClient 2");
        System.out.println("Name : "+c2.getName());
        System.out.println("Case : "+c2.getCase());
    }
    
}
