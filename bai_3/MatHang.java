/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_3;

/**
 *
 * @author huyle
 */
public class MatHang {
    private static int cnt = 1;
    private float gia;
    private int matHangID;
    private int soLuong;
    private String tenMatHang;
    
    
    
    public void ThemMatHangVaoKho(String tenMatHang, int soLuong, float gia){
        this.matHangID = cnt++;
        this.tenMatHang = tenMatHang;
        this.soLuong = soLuong;
        this.gia = gia;
    }
    
    //start of get/set
    public String getTenMatHang(){
        return this.tenMatHang;
    }
    
    public void setTenMatHang(String tenMatHang){
        this.tenMatHang = tenMatHang;
    }
    
    public int getMatHangID(){
        return this.matHangID;
    }
    
    public float getGia(){
        return this.gia;
    }
    
    public void setGia(float gia){
        this.gia = gia;
    }
    
    public float getSoLuong(){
        return this.soLuong;
    }
    
    public void setSoLuong(int soLuong){
        this.soLuong = soLuong;
    }
    //end of get/set
    
    @Override
    public String toString(){
        return String.format("%03d", matHangID)+" "+tenMatHang+" "+soLuong+" "+gia;
    }
}
