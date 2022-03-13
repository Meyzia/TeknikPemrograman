/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasus2;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class RestaurantMain {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        Restaurant menu = new Restaurant();
        
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        
        // PEMESANAN
        int banyak;
        byte kode;
        char pilihan;
        
        do{
            System.out.println("==== Menu ====");
            menu.tampilMenuMakanan();

            System.out.println("- Pemesanan -");
            System.out.print("Kode makanan: ");
            kode=scn.nextByte();
            System.out.print("Banyak pesanan: ");
            banyak=scn.nextInt();
            menu.pesanMakanan((byte) (kode-1), banyak);

            System.out.print("\nPesan lagi[y/n]? ");
            pilihan=scn.next().charAt(0);

            System.out.println("");
        }while(Character.toUpperCase(pilihan)=='Y');
    }

}
