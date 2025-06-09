/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB6.newpackage;

/**
 * Kelas Motor merupakan subclass dari abstract class Transportasi.
 * Class ini merepresentasikan kendaraan jenis motor dan layanan tambahan berupa helm.
 */
public class Motor extends Transportasi {

    // Atribut khusus untuk motor: status apakah helm disediakan
    private boolean helmDisediakan;

    /**
     * Konstruktor Motor untuk mengatur data dasar dan status helm.
     * @param plat Nomor plat kendaraan
     * @param harga Harga sewa per kilometer
     * @param helmDisediakan True jika helm disediakan, false jika tidak
     */
    public Motor(String plat, double harga, boolean helmDisediakan) {
        // Memanggil konstruktor dari class induk Transportasi
        super("Motor", plat, harga);
        this.helmDisediakan = helmDisediakan;
    }

    /**
     * Mengembalikan status apakah helm disediakan.
     * @return True jika helm disediakan
     */
    public boolean isHelmDisediakan() {
        return helmDisediakan;
    }

    /**
     * Implementasi abstract method getLayanan() dari class induk.
     * Memberikan informasi layanan helm pada pengguna.
     * @return "Helm disediakan" atau "Helm tidak disediakan"
     */
    @Override
    public String getLayanan() {
        return helmDisediakan ? "Helm disediakan" : "Helm tidak disediakan";
    }
}
