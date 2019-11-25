/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2;

import java.util.Scanner;

public class Modul2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        Kilometer km = new Kilometer();
        Centimeter cm= new Centimeter();
        Milimeter mm= new Milimeter();
        int M;
        
        System.out.print("Masukkan Jumlah Meter\t: ");
        M = n.nextInt();
        
        km.Kilometer(M);
        cm.Centimeter(M);
        mm.Milimeter(M);
    }
    
}
