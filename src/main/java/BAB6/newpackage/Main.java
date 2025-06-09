/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB6.newpackage;

/**
 * Kelas Main digunakan untuk menjalankan program dan menguji objek-objek turunan dari Transportasi,
 * yaitu Mobil dan Motor. Menampilkan data lengkap beserta perhitungan harga dengan dan tanpa diskon.
 */
public class Main {
    public static void main(String[] args) {
        double jarak = 15; // Contoh jarak tempuh dalam kilometer

        // Membuat objek mobil dan menampilkannya
        Transportasi mobil = new Mobil("B 1234 MBL", 7000, true);
        System.out.println("=== DATA MOBIL ===");
        System.out.println("Jenis     : " + mobil.getJenisTransportasi());
        System.out.println("Plat      : " + mobil.getNomorPlat());
        System.out.println("Harga/km  : Rp" + mobil.getHargaPerKm());
        System.out.println("Layanan   : " + mobil.getLayanan()); // overriding
        System.out.println("Total     : Rp" + mobil.hitungHarga(jarak)); // tanpa diskon
        System.out.println("Total (10% diskon): Rp" + mobil.hitungHarga(jarak, 10)); // overloading

        System.out.println();

        // Membuat objek motor dan menampilkannya
        Transportasi motor = new Motor("D 5678 MTR", 3000, false);
        System.out.println("=== DATA MOTOR ===");
        System.out.println("Jenis     : " + motor.getJenisTransportasi());
        System.out.println("Plat      : " + motor.getNomorPlat());
        System.out.println("Harga/km  : Rp" + motor.getHargaPerKm());
        System.out.println("Layanan   : " + motor.getLayanan()); // overriding
        System.out.println("Total     : Rp" + motor.hitungHarga(jarak)); // tanpa diskon
        System.out.println("Total (10% diskon): Rp" + motor.hitungHarga(jarak, 10)); // overloading
    }
}
