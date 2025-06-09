/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB7_NEW;

/**
 * Class Mobil adalah subclass dari abstract class Transportasi.
 * Mewakili kendaraan mobil dengan atribut tambahan: layanan supir.
 */
public class Mobil extends Transportasi {

    // Menyimpan status apakah layanan mobil termasuk supir
    private boolean adaSupir;

    /**
     * Konstruktor untuk objek Mobil.
     * @param plat Nomor plat kendaraan
     * @param harga Harga per kilometer
     * @param adaSupir True jika layanan mobil termasuk supir
     */
    public Mobil(String plat, double harga, boolean adaSupir) {
        super("Mobil", plat, harga); // Panggil konstruktor superclass
        this.adaSupir = adaSupir;
    }

    /**
     * Implementasi dari method abstract getLayanan().
     * Menentukan deskripsi layanan berdasarkan status supir.
     * @return "Dengan Supir" atau "Tanpa Supir"
     */
    @Override
    public String getLayanan() {
        return adaSupir ? "Dengan Supir" : "Tanpa Supir";
    }
}

