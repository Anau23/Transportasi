/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB6.newpackage;

/**
 * Kelas Mobil adalah subclass dari abstract class Transportasi.
 * Mewakili kendaraan mobil dengan opsi layanan supir.
 */
public class Mobil extends Transportasi {

    // Atribut tambahan untuk mobil: apakah layanan termasuk supir
    private boolean adaSupir;

    /**
     * Konstruktor untuk inisialisasi objek Mobil.
     * @param plat Nomor plat kendaraan
     * @param harga Harga sewa per kilometer
     * @param adaSupir True jika mobil termasuk supir
     */
    public Mobil(String plat, double harga, boolean adaSupir) {
        // Memanggil konstruktor dari superclass (Transportasi)
        super("Mobil", plat, harga);
        this.adaSupir = adaSupir;
    }

    /**
     * Mengembalikan status apakah mobil memiliki layanan supir.
     * @return True jika termasuk supir
     */
    public boolean isAdaSupir() {
        return adaSupir;
    }

    /**
     * Implementasi abstract method getLayanan() dari superclass.
     * Menjelaskan apakah layanan supir tersedia.
     * @return "Dengan Supir" atau "Tanpa Supir"
     */
    @Override
    public String getLayanan() {
        return adaSupir ? "Dengan Supir" : "Tanpa Supir";
    }
}
