/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_3;

/**
 *
 * @author huyle
 */
public class KhachHang {
    private static int cnt = 1;
    private String diaChi;
    private int khachHangID;
    private String tenKH;
    
    public KhachHang(String diaChi, String tenKH){
        this.diaChi = diaChi;
        this.khachHangID = cnt++;
        this.tenKH = tenKH;
    }
    
    //start of get/set
    public String getDiaChi(){
        return this.diaChi;
    }
    
    public void setDiaChi(String diaChi){
        this.diaChi = diaChi;
    }
    
    public int getKhachHangID(){
        return this.khachHangID;
    }
    
    public String getTenKH(){
        return this.tenKH;
    }
    
    public void setTenKH(String tenKH){
        this.tenKH = tenKH;
    }
    //end of get/set
    
    @Override
    public String toString(){
        return String.format("%03d", khachHangID)+" "+tenKH+" "+diaChi;
    }
}
