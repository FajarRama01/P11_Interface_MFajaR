/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p11_interface_kendaraan;

/**
 *
 * @author lenovo
 */
//public class MobilBaru {
class MobilBaru extends Mobil {
    
    private String garansi;
    
    public MobilBaru(String merek, String model, String garansi) {
        super(merek, model);
        this.garansi = garansi;
    }
    public String getGaransi() {
        return garansi;
    }
    public void info() {
        System.out.println("Mobil Baru: " + getMerek() + " " + getModel() + "(Garansi: " + garansi + ")");
    }
}
//}
