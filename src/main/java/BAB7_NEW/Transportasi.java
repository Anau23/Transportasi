/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB7_NEW;

/**
 * Abstract class Transportasi sebagai dasar untuk semua jenis kendaraan.
 * Mewakili atribut umum dan menyediakan method yang dapat digunakan oleh subclass.
 */
public abstract class Transportasi {

    // Atribut umum: jenis kendaraan, plat nomor, dan harga per kilometer
    private String jenisTransportasi;
    private String nomorPlat;
    private double hargaPerKm;

    /**
     * Konstruktor untuk menginisialisasi atribut dasar transportasi.
     * @param jenis Jenis transportasi (contoh: Mobil, Motor)
     * @param plat Nomor plat kendaraan
     * @param harga Harga sewa per kilometer
     */
    public Transportasi(String jenis, String plat, double harga) {
        this.jenisTransportasi = jenis;
        this.nomorPlat = plat;
        this.hargaPerKm = harga;
    }

    // Getter untuk setiap atribut (mengimplementasikan enkapsulasi)
    public String getJenisTransportasi() { return jenisTransportasi; }
    public String getNomorPlat() { return nomorPlat; }
    public double getHargaPerKm() { return hargaPerKm; }

    /**
     * Method untuk menghitung total harga berdasarkan jarak.
     * @param jarak Jarak tempuh (dalam kilometer)
     * @return Total biaya
     */
    public double hitungHarga(double jarak) {
        return hargaPerKm * jarak;
    }

    /**
     * Overloaded method untuk menghitung harga dengan diskon.
     * @param jarak Jarak tempuh
     * @param diskon Persentase diskon
     * @return Total biaya setelah diskon
     */
    public double hitungHarga(double jarak, double diskon) {
        return hitungHarga(jarak) - (hitungHarga(jarak) * diskon / 100);
    }

    /**
     * Method abstract untuk mendapatkan deskripsi layanan tambahan.
     * Harus diimplementasikan oleh subclass.
     * @return Deskripsi layanan (contoh: "Dengan Supir")
     */
    public abstract String getLayanan();
}

