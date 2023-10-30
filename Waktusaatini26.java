/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package waktusaatini.pkg26;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Waktusaatini26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date HariSekarang = new Date( );
        SimpleDateFormat ft = 
        new SimpleDateFormat ("E, dd.MM.yyyy hh:mm:ss a zzz");

      System.out.println("Hari ini adalah hari: " + ft.format(HariSekarang));
    }
}
