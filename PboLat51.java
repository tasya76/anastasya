/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22166013.pbo.lat51;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class PboLat51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK: ");
        String nik = input.nextLine();
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Golongan (1/2/3): ");
        int golongan = input.nextInt();
        input.nextLine(); // Menangani newline character
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        String jabatan = input.nextLine();
        System.out.print("Masukkan Jumlah Kehadiran : ");
        int jumlahKehadiran = input.nextInt();

        // Menghitung tunjangan golongan
        double tunjanganGolongan = hitungTunjanganGolongan(golongan);

        // Menghitung tunjangan jabatan
        double tunjanganJabatan = hitungTunjanganJabatan(jabatan);

        // Menghitung tunjangan kehadiran
        double tunjanganKehadiran = hitungTunjanganKehadiran(jumlahKehadiran);

        // Menghitung total gaji
        double gajiTotal = tunjanganGolongan + tunjanganJabatan + tunjanganKehadiran;

        // Menampilkan hasil perhitungan
        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK          : " + nik);
        System.out.println("NAMA         : " + nama);
        System.out.println("GOLONGAN     : " + golongan);
        System.out.println("JABATAN      : " + jabatan);
        System.out.println("TUNJANGAN GOLONGAN  : " + tunjanganGolongan);
        System.out.println("TUNJANGAN JABATAN   : " + tunjanganJabatan);
        System.out.println("TUNJANGAN KEHADIRAN : " + tunjanganKehadiran);
        System.out.println("GAJI TOTAL          : " + gajiTotal);
    }

    // Fungsi untuk menghitung tunjangan golongan
    public static double hitungTunjanganGolongan(int golongan) {
        double tunjangan = 0;
        switch (golongan) {
            case 1 -> tunjangan = 500000.0;
            case 2 -> tunjangan = 1000000.0;
            case 3 -> tunjangan = 1500000.0;
        }
        return tunjangan;
    }

    // Fungsi untuk menghitung tunjangan jabatan
    public static double hitungTunjanganJabatan(String jabatan) {
        double tunjangan = 0;
        if (jabatan.equalsIgnoreCase("Manager")) {
            tunjangan = 2000000.0;
        } else if (jabatan.equalsIgnoreCase("Kabag")) {
            tunjangan = 1000000.0;
        }
        return tunjangan;
    }

    // Fungsi untuk menghitung tunjangan kehadiran
    public static double hitungTunjanganKehadiran(int jumlahKehadiran) {
        return jumlahKehadiran * 10000.0;
    }
}