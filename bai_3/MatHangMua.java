/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_3;

/**
 *
 * @author huyle
 */
public class MatHangMua {
    private HoaDon hd;
    private int matHangMuaID;
    private MatHang mh;
    private int soLuong;
    
    public void ThemMatHangMuaCuaHoaDon(HoaDon hd, int matHangMuaID, MatHang mh, int soLuong){
        this.hd = hd;
        this.matHangMuaID = matHangMuaID;
        this.mh = mh;
        this.soLuong = soLuong;
    }
    
    //start of get/set
    public HoaDon getHoaDon(){
        return this.hd;
    }
    
    public int getMatHangMuaID(){
        return this.matHangMuaID;
    }
    
    public MatHang getMatHang(){
        return this.mh;
    }
    
    public int getSoLuong(){
        return this.soLuong;
    }
    
    public void setSoLuong(int soLuong){
        this.soLuong = soLuong;
    }
    //end of get/set
    
    @Override
    public String toString(){
        return String.format("%03d", matHangMuaID)+" "+mh.getTenMatHang()+" "+soLuong+" "+mh.getGia()*soLuong;
    }
}
