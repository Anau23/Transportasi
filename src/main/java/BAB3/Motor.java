/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB3;

/**
 *
 * @author ASUS
 */
public class Motor extends Transportasi {
    boolean helmDisediakan;

    public Motor(String plat, double harga, boolean helmDisediakan) {
        super("Motor", plat, harga);
        this.helmDisediakan = helmDisediakan;
    }
    
    void layananHelm() {
        if (helmDisediakan) {
            System.out.println("Helm disediakan.");
        } else {
            System.out.println("Helm tidak disediakan.");
        }
    }
}