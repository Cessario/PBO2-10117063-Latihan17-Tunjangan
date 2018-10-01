/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan17.tunjangan;

import java.util.Scanner;

/**
 *
 * @author DEADPOOL
 */
public class PBO210117063Latihan17Tunjangan {

    /*  Nama : Cessario Sheva Lakita Purwa Adidjaya
        NIM  : 10117063
        Kelas : IF-2
        Deskripsi Program : Menampilkan hasil perhitungan gaji
     */
    public static void main(String[] args) {
        double Gapok, tunj, tGaji ;
        char menikah='Y';
        Gapok = 6000000;
        tunj = (menikah=='Y')?0.35*Gapok:0;
        tGaji = Gapok + tunj;

        System.out.println("=====Program Tunjangan======");
        System.out.println("Berapa Gaji anda Perbulan?\t: Rp. " +Gapok  ); 
        System.out.println("Status Anda? (Menikah/Belum)\t:" + menikah);
        System.out.println("");
        System.out.println("======Hasil Perhitungan Gaji Anda======");
        System.out.println("Gaji Pokok\t:" + Gapok);       
        System.out.println("Tunjangan\t:" +tunj);
        System.out.println("Total Gaji\t:" +tGaji);
        
      
            
        
    }
}
        
    
    

