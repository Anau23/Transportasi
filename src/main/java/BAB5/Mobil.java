/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB5;

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

    @Override
    public void tampilkanDetail() {
        super.tampilkanDetail();
        System.out.println(isAdaSupir() ? "Layanan termasuk supir." : "Tanpa layanan supir.");
    }
}