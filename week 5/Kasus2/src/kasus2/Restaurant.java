package kasus2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class Restaurant {
    public String[] nama_makanan;
    public double[] harga_makanan;
    public int[] stok;
    public static byte id=0;
    private String nama_pesanan;
    private int banyak_pesanan;
    private byte id_pesanan;
    
    public Restaurant() {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }
    
    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.nama_makanan[id] = nama;
        this.harga_makanan[id] = harga;
        this.stok[id] = stok;
    }
    
    public void tampilMenuMakanan(){
        for(int i =0; i<=id;i++){
            if(!isOutOfStock(i)){
                System.out.println((i+1)+"."+nama_makanan[i] +"["+stok[i]+"]"+"\tRp. "+harga_makanan[i]);
            }
        }
    }
    
    public boolean isOutOfStock(int id){
        if(stok[id] == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public static void nextId(){
        id++;
    }

    // PEMESANAN MAKANAN
    
    public void setNama_pesanan(String _nama_pasanan){
        this.nama_pesanan=_nama_pasanan;
    }
    
    public String getNama_pesanan(){
        return this.nama_pesanan;
    }
    
    public void setBanyak_pesanan(int _banyak_pasanan){
        this.banyak_pesanan=_banyak_pasanan;
    }
    
    public int getBanyak_pesanan(){
        return this.banyak_pesanan;
    }
    
    public void setId_pesanan(byte _id_pasanan){
        this.id_pesanan=_id_pasanan;
    }
    
    public byte getId_pesanan(){
        return this.id_pesanan;
    }
    
    public void pesanMakanan(byte index, int banyak){
        setId_pesanan(index);
        setNama_pesanan(nama_makanan[id_pesanan]);
        setBanyak_pesanan(banyak);
        
        double total;
        
        if((stok[id_pesanan]-banyak_pesanan)<0){
            System.out.println("Stok tidak cukup");
        }else{
            stok[id_pesanan]=stok[id_pesanan]-banyak_pesanan;
            total = banyak_pesanan*harga_makanan[id_pesanan];
            printPesanan(total);
        }
    }
    
    public void printPesanan(Double total){
        System.out.println("==== PESANANAN ====");
        System.out.println("Nama pesanan: "+nama_pesanan);
        System.out.println("Banyak: "+banyak_pesanan);
        System.out.println("Total: Rp."+total);
    }
}
