/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aggregation;

import java.util.*;
/**
 *
 * @author lenovo
 */
public class OSIS {
    public static void main(String[] args) {
        Pengurus s1 = new Pengurus("Mey", "Ketua", "D4-B");
        Pengurus s2 = new Pengurus("Mei", "Sekretaris", "D3-B");
        Pengurus s3 = new Pengurus("Zia", "Bendahara", "D4-A");
        Pengurus s4 = new Pengurus("Gal", "Ketua Divisi", "D4-B");
        Pengurus s5 = new Pengurus("Tia", "Pengurus", "D3-B");
        Pengurus s6 = new Pengurus("Dy", "Pengurus", "D4-A");
        
        List<Pengurus> pengurusInti = new ArrayList<Pengurus>();
        pengurusInti.add(s1);
        pengurusInti.add(s2);
        pengurusInti.add(s3);
        
        List<Pengurus> pengurusOlahraga = new ArrayList<Pengurus>();
        pengurusOlahraga.add(s4);
        pengurusOlahraga.add(s5);
        pengurusOlahraga.add(s6);
        
        Divisi inti = new Divisi("Inti", pengurusInti);
        System.out.println("Divisi "+inti.Nama);
        
        List<Pengurus> nPengurus = inti.getBanyakPengurus();
        for(Pengurus p : nPengurus){
            System.out.println("Nama : "+p.Nama);
            System.out.println("Kelas : "+p.Kelas);
            System.out.println("Jabatan : "+p.Jabatan);
        }
        
        Divisi olahraga = new Divisi("Olahraga", pengurusOlahraga);
        System.out.println("\nDivisi "+olahraga.Nama);
        
        nPengurus = olahraga.getBanyakPengurus();
        for(Pengurus p : nPengurus){
            System.out.println("Nama : "+p.Nama);
            System.out.println("Kelas : "+p.Kelas);
            System.out.println("Jabatan : "+p.Jabatan);
        }
    }
}
 