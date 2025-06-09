/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB6.newpackage;

/**
 *
 * @author ASUS
 */
public abstract class Transportasi {
    // Atribut disembunyikan (private) untuk menerapkan enkapsulasi
    private String jenisTransportasi;
    private String nomorPlat;
    private double hargaPerKm;

    /**
     * Konstruktor untuk inisialisasi objek Transportasi.
     * @param jenis Jenis kendaraan (Mobil atau Motor)
     * @param plat Nomor plat kendaraan
     * @param harga Harga per kilometer
     */
    public Transportasi(String jenis, String plat, double harga) {
        this.jenisTransportasi = jenis;
        this.nomorPlat = plat;
        this.hargaPerKm = harga;
    }

    // Getter untuk atribut jenis transportasi
    public String getJenisTransportasi() {
        return jenisTransportasi;
    }

    // Getter untuk atribut nomor plat
    public String getNomorPlat() {
        return nomorPlat;
    }

    // Getter untuk harga per km
    public double getHargaPerKm() {
        return hargaPerKm;
    }

    /**
     * Menghitung total harga berdasarkan jarak tanpa diskon.
     * @param jarak Jarak tempuh dalam kilometer
     * @return Total biaya
     */
    public double hitungHarga(double jarak) {
        return hargaPerKm * jarak;
    }

    /**
     * Overloaded method: Menghitung harga dengan tambahan diskon.
     * @param jarak Jarak tempuh dalam kilometer
     * @param diskonPersen Persentase diskon (misalnya 10 untuk 10%)
     * @return Total biaya setelah diskon
     */
    public double hitungHarga(double jarak, double diskonPersen) {
        double total = hitungHarga(jarak); // pakai versi tanpa diskon
        return total - (total * diskonPersen / 100); // diskon dikurangkan
    }

    /**
     * Method abstract yang harus di-override oleh subclass.
     * Digunakan untuk mengembalikan informasi layanan tambahan.
     * @return Deskripsi layanan (misalnya: \"Dengan Supir\" atau \"Helm disediakan\")
     */
    public abstract String getLayanan();
}