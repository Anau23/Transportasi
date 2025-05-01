/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB5;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // Objek mobil dengan layanan supir
        Mobil mobil = new Mobil("B 1234 MBL", 7000, true);
        // Objek motor tanpa helm
        Motor motor = new Motor("D 5678 MTR", 3000, false);

        double jarak = 10; // km
        double diskon = 10; // %

        System.out.println("=== MOBIL ===");
        mobil.tampilkanDetail(); // overriding
        System.out.println("Total Harga (tanpa diskon): Rp" + mobil.hitungHarga(jarak)); // overloading
        System.out.println("Total Harga (diskon 10%): Rp" + mobil.hitungHarga(jarak, diskon));

        System.out.println("\n=== MOTOR ===");
        motor.tampilkanDetail(); // overriding
        System.out.println("Total Harga (tanpa diskon): Rp" + motor.hitungHarga(jarak));
        System.out.println("Total Harga (diskon 10%): Rp" + motor.hitungHarga(jarak, diskon));
    }
}
