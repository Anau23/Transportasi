/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB4;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek mobil dan motor dengan data awal
        Mobil mobil = new Mobil("B 1234 MBL", 6500, true);
        Motor motor = new Motor("D 5678 MTR", 3000, false);

        // Menampilkan detail menggunakan getter (bukan langsung akses atribut)
        System.out.println("=== MOBIL ===");
        System.out.println("Jenis: " + mobil.getJenisTransportasi());
        System.out.println("Plat: " + mobil.getNomorPlat());
        System.out.println("Harga per Km: Rp" + mobil.getHargaPerKm());
        System.out.println("Layanan: " + (mobil.isAdaSupir() ? "Termasuk supir" : "Tanpa supir"));

        System.out.println("\n=== MOTOR ===");
        System.out.println("Jenis: " + motor.getJenisTransportasi());
        System.out.println("Plat: " + motor.getNomorPlat());
        System.out.println("Harga per Km: Rp" + motor.getHargaPerKm());
        System.out.println("Layanan: " + (motor.isHelmDisediakan() ? "Helm disediakan" : "Helm tidak disediakan"));
    }
}
