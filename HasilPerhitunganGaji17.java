/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hasil.perhitungan.gaji.pkg17;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class HasilPerhitunganGaji17 {
    public static void main(String[] args) {
         System.out.println("======Hasil Perhitungan Gaji Anda======");
         System.out.println();
         
        // Input gaji pokok
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan gaji pokok: Rp ");
        double gajiPokok = scanner.nextDouble();

        // Input status pernikahan
        System.out.print("Status Pernikahan Anda? (ya/belum): ");
        String statusPernikahan = scanner.next();
        
         System.out.println("======Hasil Perhitungan Gaji Anda======");
         System.out.println();

        // Hitung tunjangan
        double tunjangan = 0;
        if (statusPernikahan.equalsIgnoreCase("ya")) {
            tunjangan = 0.35 * gajiPokok;
        }

        // Hitung total gaji
        double totalGaji = gajiPokok + tunjangan;

        // Output hasil
        System.out.println("\nDetail Gaji Karyawan:");
        System.out.println("Gaji Pokok      : Rp " + gajiPokok);
        System.out.println("Tunjangan       : Rp " + tunjangan);
        System.out.println("Total Gaji      : Rp " + totalGaji);
    }
}
}