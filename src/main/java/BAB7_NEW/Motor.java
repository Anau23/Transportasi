/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB7_NEW;

/**
 * Class Motor adalah subclass dari Transportasi.
 * Menambahkan atribut spesifik yaitu layanan helm.
 */
public class Motor extends Transportasi {
    private boolean helmDisediakan;

    /**
     * Konstruktor Motor
     * @param plat Nomor plat kendaraan
     * @param harga Harga per kilometer
     * @param helmDisediakan Status apakah helm disediakan
     */
    public Motor(String plat, double harga, boolean helmDisediakan) {
        super("Motor", plat, harga);
        this.helmDisediakan = helmDisediakan;
    }

    /**
     * Implementasi method abstract getLayanan().
     * Memberikan informasi apakah helm tersedia.
     * @return String deskripsi layanan
     */
    @Override
    public String getLayanan() {
        return helmDisediakan ? "Helm disediakan" : "Helm tidak disediakan";
    }
}

