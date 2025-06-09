/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB9_NEW;

/**
 *
 * @author ASUS
 */
// Class Motor mengimplementasikan interface
public class Motor extends Transportasi implements InformasiTransportasi {
    private boolean helm;

    public Motor(String nomorPlat, double hargaPerKm, boolean helm) {
        super(nomorPlat, hargaPerKm);
        this.helm = helm;
    }

    public boolean isHelm() {
        return helm;
    }

    public void setHelm(boolean helm) {
        this.helm = helm;
    }

    @Override
    public void layanan() {
        System.out.println("Layanan: " + (helm ? "Helm Disediakan" : "Tanpa Helm"));
    }

    @Override
    public void tampilkanInfoLengkap() {
        System.out.println("Informasi Motor");
        System.out.println("Nomor Plat: " + nomorPlat);
        System.out.println("Harga per Km: " + hargaPerKm);
        layanan();
    }
}