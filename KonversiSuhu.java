/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan2;

/**
 *
 * @author ASUS
 */
public class KonversiSuhu {
     public static void main(String[] args) {
        double C = 10;
        double F = 15;
        double R = 5;

        // a. Celcius <-> Fahrenheit
        System.out.println("a. Celcius <-> Fahrenheit");
        System.out.println("   " + C + " C = " + (C * 9 / 5 + 32) + " F");
        System.out.println("   " + F + " F = " + ((F - 32) * 5 / 9) + " C");

        // b. Celcius <-> Reamur
        System.out.println("b. Celcius <-> Reamur");
        System.out.println("   " + C + " C = " + (C * 4 / 5) + " R");
        System.out.println("   " + R + " R = " + (R * 5 / 4) + " C");

        // c. Fahrenheit <-> Reamur
        System.out.println("c. Fahrenheit <-> Reamur");
        System.out.println("   " + F + " F = " + ((F - 32) * 4 / 9) + " R");
        System.out.println("   " + R + " R = " + (R * 9 / 4 + 32) + " F");
    }
}
