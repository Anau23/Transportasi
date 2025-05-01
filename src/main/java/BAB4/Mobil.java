/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB4;

/**
 *
 * @author ASUS
 */
public class Mobil extends Transportasi {
    private boolean adaSupir;

    public Mobil(String plat, double harga, boolean adaSupir) {
        super("Mobil", plat, harga);
        setAdaSupir(adaSupir);
    }

    public boolean isAdaSupir() {
        return adaSupir;
    }

    public void setAdaSupir(boolean adaSupir) {
        this.adaSupir = adaSupir;
    }

    public void layananSupir() {
        if (isAdaSupir()) {
            System.out.println("Layanan mobil termasuk supir.");
        } else {
            System.out.println("Layanan mobil tanpa supir.");
        }
    }
}
