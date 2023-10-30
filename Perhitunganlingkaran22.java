/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perhitunganlingkaran.pkg22;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Perhitunganlingkaran22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("======Perhitungan Lingkaran======");
        System.out.println(); 
        
        Scanner scanner = new Scanner(System.in);

        // Input diameter lingkaran
        System.out.print("Masukkan nilai diameter lingkaran: ");
        double diameter = scanner.nextDouble();
        
        // Perhitungan
        double jariJari = diameter / 2;
        double luas = Math.PI * Math.pow(jariJari, 2);
        double keliling = 2 * Math.PI * jariJari;

        System.out.println("======Hasil Perhitungan Lingkaran======");
        System.out.println();
        
        // Output hasil perhitungan
        System.out.println("jariJari lingkaran : " + jariJari );
        System.out.println("Luas lingkaran : " + luas);
        System.out.println("Keliling lingkaran : " + keliling);
            
    } private static double konversiKeCm(double nilai) {
            //contoh sederhana: 1 satuan ke cm
            return nilai * 2.54; // 1 inci = 2.54 cm
        }
}