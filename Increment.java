/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan2;

/**
 *
 * @author ASUS
 */
public class Increment {
     public static void main(String[] args) {
        int a = 5;
        System.out.println("Nilai awal a        : " + a);
        System.out.println("Post-increment a++  : " + (a++)); // tampil 5, lalu a menjadi 6
        System.out.println("Nilai a sekarang    : " + a);
        System.out.println("Pre-increment ++a   : " + (++a)); // a menjadi 7, lalu tampil 7
        System.out.println("Nilai a akhir       : " + a);

        a += 1; // increment dengan operator penugasan
        System.out.println("Setelah a += 1      : " + a);
    }
}
