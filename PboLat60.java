/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22166013.pbo.lat60;

/**
 *
 * @author ASUS
 */
public class PboLat60 {
public static void main(String[] args) {

        String pakaian = "Pakaian hitam beserta corak awan merah";
        String tujuan = "Menangkap Semua Jinchuriki";
        
        Anggota itachi = new Anggota("Itachi Uchiha", "Konohagakure", "Kunai", 
                        "Anbu Captain Missing Ninja", "Mangekyo Sharingan", 
                        "Kehabisan Chakra" ,"Suzaku(Merah darah)" , 
                        true, pakaian, tujuan);
        // ... (inisialisasi anggota lainnya)

        System.out.println("Profile Akatsuki");
        System.out.println("===============================");
        System.out.println();
        System.out.println("Identitas : " + itachi.getPakaian());
        System.out.println("Tujuan : " + itachi.getTujuan());
        System.out.println();

        itachi.displayAnggota();
        // ... (memanggil displayAnggota() untuk anggota lainnya)
    }
}

class Anggota {
    private String nama;
    private String asal;
    private String senjata;
    private String peran;
    private String kekkeiGenkai;
    private String kematian;
    private String bijuu;
    private boolean hidup;
    private String pakaian;
    private String tujuan;

    public Anggota(String nama, String asal, String senjata, String peran,
                   String kekkeiGenkai, String kematian, String bijuu,
                   boolean hidup, String pakaian, String tujuan) {
        // ... (konstruktor)
    }

    public String getPakaian() {
        return pakaian;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void displayAnggota() {
        // ... (implementasi metode displayAnggota())
    }
}