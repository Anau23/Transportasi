/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Import class Scanner dan class turunan dari Transportasi dari package BAB7_NEW
import java.util.Scanner;
import BAB7_NEW.Transportasi;
import BAB7_NEW.Mobil;
import BAB7_NEW.Motor;

/**
 * Class ini menguji exception handling dan polimorfisme
 * menggunakan input dari pengguna melalui konsol.
 */
public class Transportasi_Exception {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Transportasi t = null; // Polimorfisme: referensi ke superclass

        try {
            // Input dari pengguna
            System.out.print("Pilih jenis transportasi (1. Mobil, 2. Motor): ");
            int pilihan = Integer.parseInt(input.nextLine());

            System.out.print("Masukkan nomor plat: ");
            String plat = input.nextLine();

            System.out.print("Masukkan harga per km: ");
            double harga = Double.parseDouble(input.nextLine());

            System.out.print("Masukkan jarak (km): ");
            double jarak = Double.parseDouble(input.nextLine());

            System.out.print("Apakah layanan tersedia? (true/false): ");
            boolean layanan = Boolean.parseBoolean(input.nextLine());

            // Inisialisasi objek berdasarkan input pilihan
            if (pilihan == 1) {
                t = new Mobil(plat, harga, layanan);
            } else if (pilihan == 2) {
                t = new Motor(plat, harga, layanan);
            } else {
                // Custom exception jika input tidak valid
                throw new Exception("Pilihan jenis transportasi tidak valid!");
            }

            // Menampilkan hasil
            System.out.println("\n=== DETAIL PEMESANAN ===");
            System.out.println("Jenis       : " + t.getJenisTransportasi());
            System.out.println("Plat        : " + t.getNomorPlat());
            System.out.println("Harga/km    : Rp" + t.getHargaPerKm());
            System.out.println("Total Harga : Rp" + t.hitungHarga(jarak));
            System.out.println("Layanan     : " + t.getLayanan());

        } catch (NumberFormatException e) {
            // Menangani kesalahan jika input bukan angka
            System.out.println("Input harus berupa angka yang valid!");
        } catch (ArithmeticException e) {
            // Menangani kesalahan logika aritmatika
            System.out.println("Terjadi kesalahan aritmatika (mungkin pembagian dengan nol).");
        } catch (Exception e) {
            // Menangani exception lain yang lebih umum
            System.out.println("Kesalahan: " + e.getMessage());
        } finally {
            // Pesan akhir program
            System.out.println("\nTerima kasih telah menggunakan layanan.");
        }
    }
}