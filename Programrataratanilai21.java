/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programrataratanilai.pkg21;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Programrataratanilai21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inisialisasi variabel
        int jumlahMahasiswa = 0;
        int banyaknyaMahasiswa;
        double rataRata;
        
        // Input banyak nilai
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyaknya mahasiswa: ");
        banyaknyaMahasiswa = input.nextInt();
        
        // Input nilai dan hitung jumlah nilai
        for (int i = 1; i <= banyaknyaMahasiswa; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + i + ": ");
            int nilai = input.nextInt();
            jumlahMahasiswa += nilai;
        }
        
        // Hitung rata-rata
        rataRata = (double) jumlahMahasiswa / banyaknyaMahasiswa;
        
        // Output rata-rata
        System.out.println("Maka, Rata-rata Nilainya adalah " + rataRata);
        
        // Developed by
        System.out.println("Developed by : Nur Hidayah");
    }
}