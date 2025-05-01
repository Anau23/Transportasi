/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB3;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Mobil mbl = new Mobil("B 2345 XYZ", 7000, true);
        Motor mtr = new Motor("D 4567 ABC", 3000, false);

        System.out.println("=== INFO MOBIL ===");
        mbl.tampilkanDetail();
        mbl.layananSupir();

        System.out.println("\n=== INFO MOTOR ===");
        mtr.tampilkanDetail();
        mtr.layananHelm();
    }
}
