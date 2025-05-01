/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB3;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Transportasi {
    protected  String jenisTransportasi;
    protected String nomorPlat;
    protected double hargaPerKm;

    public Transportasi(String jenisTransportasi, String nomorPlat, double hargaPerKm) {
        this.jenisTransportasi = jenisTransportasi;
        this.nomorPlat = nomorPlat;
        this.hargaPerKm = hargaPerKm;
    }

    double hitungHarga(double jarak) {
        return hargaPerKm * jarak;
    }

    void tampilkanDetail() {
        System.out.println("Jenis Transportasi: " + jenisTransportasi);
        System.out.println("Nomor Plat: " + nomorPlat);
        System.out.println("Harga per Km: Rp" + hargaPerKm);
    }
}



