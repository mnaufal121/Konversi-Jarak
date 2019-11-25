/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2;

/**
 *
 * @author Asus
 */
public class Struktur {
    public static void main(String[]args){
        int M = 100;
        double KM;
        double CM;
        double MM;
        
        KM = M/1000.0;
        CM = M*100;
        MM = M*1000;
        
        System.out.println("Hasil Konversi Panjang");
        System.out.println("Meter ke Kilometer\t: "+KM);
        System.out.println("Meter ke Centimeter\t: "+CM);
        System.out.println("Meter ke Milimeter\t: "+MM);
        
    }
}
