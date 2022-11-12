/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de4;

/**
 *
 * @author admin
 */
public class Chuc_vu {
    private String cv;
    private float luongcb;

    public Chuc_vu(String cv, float luongcb) {
        this.cv = cv;
        this.luongcb = luongcb;
    }
    public float Luong(){
        float luong;
        switch(cv){
            case "Trưởng phòng":
                luong=luongcb+ 100000;  break;
            case "Phó phòng":
                luong=luongcb+ 500000;  break;
            case "Nhân viên":
                luong=luongcb;  break;
            default:
                luong=0; break; 
        }
        return luong;
    }
    public String Phucap(){
        String pc="";
        switch(cv){
            case "Trưởng phòng":
                pc="100000";  break;
            case "Phó phòng":
                pc="500000";  break;
            case "Nhân viên":
                pc="0";  break;
        }
        return pc;
    }
  
    
    
}
