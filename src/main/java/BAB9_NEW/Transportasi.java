/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB9_NEW;

/**
 *
 * @author ASUS
 */
public abstract class Transportasi {
    protected String nomorPlat;
    protected double hargaPerKm;

    public Transportasi(String nomorPlat, double hargaPerKm) {
        this.nomorPlat = nomorPlat;
        this.hargaPerKm = hargaPerKm;
    }

    public String getNomorPlat() {
        return nomorPlat;
    }

    public double getHargaPerKm() {
        return hargaPerKm;
    }

    public void setNomorPlat(String nomorPlat) {
        this.nomorPlat = nomorPlat;
    }

    public void setHargaPerKm(double hargaPerKm) {
        this.hargaPerKm = hargaPerKm;
    }

    public abstract void layanan();

    public double hitungHarga(double jarak) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getJenisTransportasi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getLayanan() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
