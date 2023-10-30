/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hurufbesarkecil.pkg27;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Hurufbesarkecil27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();
        
        System.out.println("====Hasil Formatting====");
         System.out.println();

        System.out.println("uruf Besar: " + kalimat.toUpperCase());
        System.out.println("Huruf Kecil: " + kalimat.toLowerCase());

        }
    }
