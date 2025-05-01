/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB4;

/**
 *
 * @author ASUS
 */
public class Motor extends Transportasi {
    private boolean helmDisediakan;

    public Motor(String plat, double harga, boolean helmDisediakan) {
        super("Motor", plat, harga);
        setHelmDisediakan(helmDisediakan);
    }

    public boolean isHelmDisediakan() {
        return helmDisediakan;
    }

    public void setHelmDisediakan(boolean helmDisediakan) {
        this.helmDisediakan = helmDisediakan;
    }

    public void layananHelm() {
        if (isHelmDisediakan()) {
            System.out.println("Helm disediakan.");
        } else {
            System.out.println("Helm tidak disediakan.");
        }
    }
}

