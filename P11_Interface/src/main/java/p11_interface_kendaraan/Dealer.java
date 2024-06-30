/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p11_interface_kendaraan;

/**
 *
 * @author lenovo
 */
//public class Dealer {
class Dealer {
    
    private String nama;
    private MobilBaru mobilBaru;
    private MobilBekas mobilBekas;
    
    public Dealer(String nama, MobilBaru mobilBaru, MobilBekas mobilBekas) {
        this.nama = nama;
        this.mobilBaru = mobilBaru;
        this.mobilBekas = mobilBekas;
    }
    public String getNama() {
        return nama;
    }

    public void info() {
        System.out.println("Dealer: " + nama);
        mobilBaru.info();
        mobilBekas.info();
    }
}
//}
