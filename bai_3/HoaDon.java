/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_3;

/**
 *
 * @author huyle
 */
public class HoaDon {
    private static int cnt = 1;
    
    private int HoaDonID;
    private KhachHang kh;
    private String ngayBan;
    private float tongTien;
    
    public void ThemHoaDon(KhachHang kh, String ngayBan){
        this.HoaDonID = cnt++;
        this.kh = kh;
        this.ngayBan = ngayBan;
    }
    
    //start of get/set
    public int getHoaDonID(){
        return this.HoaDonID;
    }
    
    public KhachHang getKhachHang(){
        return this.kh;
    }
    
    public void setKhachHang(KhachHang kh){
        this.kh = kh;
    }
    
    public String getNgayBan(){
        return this.ngayBan;
    }
    
    public void setNgayBan(String ngayBan){
        this.ngayBan = ngayBan;
    }
    
    public float getTongTien(){
        return this.tongTien;
    }
    
    public void setTongTien(float tongTien){
        this.tongTien = tongTien;
    }
    //end of get/set
    
    public void InHoaDon(){
        System.out.println(String.format("%03d", HoaDonID)+" "+kh.getTenKH()+" "+ngayBan+" "+tongTien);
    }
}
