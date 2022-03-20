/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aggregation;

import java.util.List;

/**
 *
 * @author lenovo
 */
public class Divisi {
    String Nama;
    List<Pengurus> pengurus;

    public Divisi(String Nama, List<Pengurus> pengurus) {
        this.Nama = Nama;
        this.pengurus = pengurus;
    }
    
    List<Pengurus> getBanyakPengurus(){
        return pengurus;
    }
}
