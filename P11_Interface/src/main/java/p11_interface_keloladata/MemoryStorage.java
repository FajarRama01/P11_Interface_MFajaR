/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p11_interface_keloladata;

import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class MemoryStorage implements DataStorage{
    
//    private String data;
//    
//    @Override
//    public void writeData(String data) {
//        this.data = data;
//    }
//    
//    @Override
//    public String readData() {
//        return this.data;
//    }
    
    private ArrayList<String> data;
    
    public MemoryStorage() {
        this.data = new ArrayList<>();
    }
    
    @Override
    public void writeData(String data) {
        this.data.add(data);
    }
    
    @Override
    public String readData() {
        StringBuilder sb = new StringBuilder();
        for (String item : this.data) {
            sb.append(item);
        }
        return sb.toString();
    }
}
