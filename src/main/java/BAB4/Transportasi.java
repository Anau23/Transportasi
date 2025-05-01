/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB4;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Transportasi {
    protected String jenisTransportasi;
    protected String nomorPlat;
    protected double hargaPerKm;

    public Transportasi(String jenis, String plat, double harga) {
        setJenisTransportasi(jenis);
        setNomorPlat(plat);
        setHargaPerKm(harga);
    }

    public String getJenisTransportasi() {
        return jenisTransportasi;
    }

    public void setJenisTransportasi(String jenisTransportasi) {
        this.jenisTransportasi = jenisTransportasi;
    }

    public String getNomorPlat() {
        return nomorPlat;
    }

    public void setNomorPlat(String nomorPlat) {
        this.nomorPlat = nomorPlat;
    }

    public double getHargaPerKm() {
        return hargaPerKm;
    }

    public void setHargaPerKm(double hargaPerKm) {
        this.hargaPerKm = hargaPerKm;
    }

    public double hitungHarga(double jarak) {
        return getHargaPerKm() * jarak;
    }

    public void tampilkanDetail() {
        System.out.println("Jenis Transportasi: " + getJenisTransportasi());
        System.out.println("Nomor Plat: " + getNomorPlat());
        System.out.println("Harga per Km: Rp" + getHargaPerKm());
    }
}





    

    

    
    
    

