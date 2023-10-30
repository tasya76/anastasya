/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package saldotabungan.pkg19;

import java.text.DecimalFormat;

/**
 *
 * @author ASUS
 */
public class Saldotabungan19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Saldo Awal
        double saldoAwal = 2500000;
        // Bunga per Bulan (dalam persen)
        double bungaPerBulan = 15;
        // Lama (bulan)
        int lamaBulan = 6;
        
         // Format saldo awal sebagai mata uang
        DecimalFormat df = new DecimalFormat("#,###,###");
        String saldoAwalFormatted = df.format(saldoAwal);

        // Hitung saldo per bulan
        for (int i = 1; i <= lamaBulan; i++) {
            double bunga = saldoAwal * (bungaPerBulan / 100);
            saldoAwal += bunga;
        // Format saldo per bulan sebagai mata uang
        String saldoBulanFormatted = df.format(saldoAwal);
        System.out.println("Saldo di Bulan ke- " + i + ": Rp. " + saldoBulanFormatted);
        }
    }
}