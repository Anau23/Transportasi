/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB9_NEW;

/**
 *
 * @author ASUS
 */
public class Mobil extends Transportasi implements InformasiTransportasi {
    private boolean supir;

    public Mobil(String nomorPlat, double hargaPerKm, boolean supir) {
        super(nomorPlat, hargaPerKm);
        this.supir = supir;
    }

    public boolean isSupir() {
        return supir;
    }

    public void setSupir(boolean supir) {
        this.supir = supir;
    }

    @Override
    public void layanan() {
        System.out.println("Layanan: " + (supir ? "Dengan Supir" : "Tanpa Supir"));
    }

    @Override
    public void tampilkanInfoLengkap() {
        System.out.println("Informasi Mobil");
        System.out.println("Nomor Plat: " + nomorPlat);
        System.out.println("Harga per Km: " + hargaPerKm);
        layanan();
    }
}
