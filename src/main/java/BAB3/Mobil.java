/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB3;

/**
 *
 * @author ASUS
 */
public class Mobil extends Transportasi {
    boolean adaSupir;

    public Mobil(String plat, double harga, boolean adaSupir) {
        super("Mobil", plat, harga);
        this.adaSupir = adaSupir;
    }
    
    void layananSupir() {
        if (adaSupir) {
            System.out.println("Layanan mobil termasuk supir.");
        } else {
            System.out.println("Layanan mobil tanpa supir.");
        }
    }
}