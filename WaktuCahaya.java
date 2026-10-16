/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan2;

/**
 *
 * @author ASUS
 */
public class WaktuCahaya {
     public static void main(String[] args) {
        double kecepatanCahaya = 300000;     // km/s
        double jarakBulan = 384400;          // km
        double jarakMatahari = 152100000;    // km (152,1 juta km)

        double waktuBulan = jarakBulan / kecepatanCahaya;       // detik
        double waktuMatahari = jarakMatahari / kecepatanCahaya; // detik

        System.out.println("Kecepatan cahaya = " + kecepatanCahaya + " km/s");
        System.out.printf("Waktu bumi ke bulan    : %.4f detik%n", waktuBulan);
        System.out.printf("Waktu bumi ke matahari : %.2f detik (%.2f menit)%n",
                waktuMatahari, waktuMatahari / 60);
    }
}
