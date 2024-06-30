/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p11_interface_kendaraan;

/**
 *
 * @author lenovo
 */
//public class Mobil {
class Mobil implements Kendaraan {
    
    private String merek;
    private String model;
    
    public Mobil(String merek, String model) {
        this.merek = merek;
        this.model = model;
    }
    public String getMerek() {
        return merek;
    }
    public String getModel() {
        return model;
    }
    public void info() {
        System.out.println("Mobil: " + merek + " " + model);
    }
}
//}
