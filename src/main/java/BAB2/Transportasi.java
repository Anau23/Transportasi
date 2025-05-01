/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB2;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Transportasi {
    // Atribut transportasi
    String jenisTransportasi;
    String nomorPlat;
    double hargaPerKm;

    // Constructor untuk menginisialisasi atribut saat objek dibuat
    public Transportasi(String jenis, String plat, double harga) {
        this.jenisTransportasi = jenis;
        this.nomorPlat = plat;
        this.hargaPerKm = harga;
    }

    // Method untuk menghitung total biaya perjalanan berdasarkan jarak
    double hitungHarga(double jarak) {
        return hargaPerKm * jarak;
    }

    // Method untuk menampilkan informasi transportasi
    void tampilkanDetail() {
        System.out.println("Jenis Transportasi: " + jenisTransportasi);
        System.out.println("Nomor Plat: " + nomorPlat);
        System.out.println("Harga per Km: Rp" + hargaPerKm);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menampilkan pilihan transportasi
        System.out.println("=== Sistem Pemesanan Transportasi ===");
        System.out.println("Pilih jenis transportasi:");
        System.out.println("1. Mobil (Rp6500 per km)");
        System.out.println("2. Motor (Rp2500 per km)");

        // Input pilihan user
        System.out.print("Masukkan pilihan (1-2): ");
        int pilihan = scanner.nextInt();

        // Deklarasi objek transportasi menggunakan konstruktor
        Transportasi transportasi = null;

        // Membuat objek sesuai pilihan pengguna
        if (pilihan == 1) {
            transportasi = new Transportasi("Mobil", "B 1234 ABC", 6500);
        } else if (pilihan == 2) {
            transportasi = new Transportasi("Motor", "D 5678 XYZ", 2500);
        } else {
            System.out.println("Pilihan tidak valid!");
            System.exit(0);
        }

        // Menampilkan detail kendaraan yang dipilih
        System.out.println("\nDetail Transportasi Anda:");
        transportasi.tampilkanDetail();

        // Input jarak perjalanan
        System.out.print("\nMasukkan jarak perjalanan (dalam km): ");
        double jarak = scanner.nextDouble();

        // Menghitung dan menampilkan total harga
        double totalHarga = transportasi.hitungHarga(jarak);
        System.out.println("Total Harga: Rp" + totalHarga);

        // Konfirmasi pemesanan
        System.out.print("\nKonfirmasi pemesanan? (ya/tidak): ");
        String konfirmasi = scanner.next().toLowerCase();

        // Menampilkan hasil berdasarkan konfirmasi user
        if (konfirmasi.equals("ya")) {
            System.out.println("\nPemesanan Berhasil! Selamat Menikmati Perjalanannya.");
        } else {
            System.out.println("\nPemesanan Dibatalkan.");
        }

        // Menutup scanner
        scanner.close();
    }
}
