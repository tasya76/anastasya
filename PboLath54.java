/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22166013.pbo.lath54;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class PboLath54 {    
    public static void main(String[] args) {
        Koordinat koordinat = new Koordinat("Jingga", 10, 4);

        // Menampilkan informasi koordinat
        koordinat.displayInfo();
    }
}

class Koordinat {
    private String warna;
    private int x;
    private int y;

    // Konstruktor
    public Koordinat(String warna, int x, int y) {
        this.warna = warna;
        this.x = x;
        this.y = y;
    }

    // Metode untuk menampilkan informasi koordinat
    public void displayInfo() {
        System.out.println("Warna koordinat: " + warna);
        System.out.println("Koordinat Sumbu x: " + x + ", y: " + y);
    }
}
    