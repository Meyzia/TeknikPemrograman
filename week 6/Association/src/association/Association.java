/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package association;

import java.util.*;

/**
 *
 * @author lenovo
 */

class Client{
    String Name;
    String Case;
    List<Lawyer> lawyers;

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
    
    void setLawyer(List<Lawyer> lawyers){
        this.lawyers = lawyers;
    }
    List<Lawyer> getLawyer(){
        return lawyers;
    }
}

class Lawyer{
    String Name;
    List<Client> clients;
    
    void setName(String _Name){
        this.Name = _Name;
    }
    String getName(){
        return this.Name;
    }
    
    void setClient(List<Client> clients){
        this.clients = clients;
    }
    List<Client> getClient(){
        return clients;
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
        
        Lawyer l2 = new Lawyer();
        l2.setName("Kang Sol A");
        
        Client c1 = new Client();
        c1.setName("Kang Sol B");
        c1.setCase("Plagiarism");
        
        Client c2 = new Client();
        c2.setName("Yoo Seung-Jae");
        c2.setCase("Theft");
        
        List<Client> listClient = new ArrayList<Client>();
        listClient.add(c1);
        listClient.add(c2);
        
        l1.setClient(listClient);
        
        List<Lawyer> listLawyer = new ArrayList<Lawyer>();
        listLawyer.add(l1);
        listLawyer.add(l2);
        
        c1.setLawyer(listLawyer);
        
        System.out.println("Lawyer : "+l1.getName());
        List<Client> nClient = l1.getClient();
        for(Client i : nClient){
            System.out.println("Name : "+i.getName());
            System.out.println("Case : "+i.getCase());
        }
        
        System.out.println("\nClient : "+c1.getName());
        System.out.println("Case : "+c1.getCase());
        List<Lawyer> nLawyer = c1.getLawyer();
        for(Lawyer i : nLawyer){
            System.out.println("Lawyer name : "+i.getName());
        }
    }
    
}
