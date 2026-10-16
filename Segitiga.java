/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan2;

/**
 *
 * @author ASUS
 */
public class Segitiga {
     public static void main(String[] args) {
        double a = 6; // tinggi (sisi AB)
        double b = 8; // alas (sisi BC)

        // Soal 5: luas segitiga
        double luas = 0.5 * a * b;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Luas segitiga = " + luas);

        // Soal 6: sisi miring c dengan rumus Pythagoras, lalu keliling
        double c = Math.sqrt((a * a) + (b * b));
        double keliling = a + b + c;
        System.out.println("Sisi miring c = " + c);
        System.out.println("Keliling segitiga = " + keliling);
    }
}
