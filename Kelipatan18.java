/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kelipatan.pkg18;

/**
 *
 * @author ASUS
 */
public class Kelipatan18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bilangan kelipatan 3.5 dari 3.5 hingga 35:");

        for (double i = 3.5; i <= 35; i+= 0.5) {
            // Cek apakah bilangan merupakan kelipatan 3.5 
            if (i % 3.5 == 0) {
                System.out.println(i);
            }
        }
    }
}
