/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_3;
import java.util.*;
/**
 *
 * @author huyle
 */
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<MatHang> listMatHang = new ArrayList<>();
        int t = in.nextInt();
        while(t-- > 0){
            in.nextLine();
            MatHang a = new MatHang();
            System.out.println("Nhập thông tin mặt hàng (tên, số lượng, giá):");
            a.ThemMatHangVaoKho(in.nextLine(), in.nextInt(), in.nextFloat());
            listMatHang.add(a);
        }
        //Them va in ra 3 mat hang XYZ trong kho
        System.out.println("Thông tin kho hàng:");
        System.out.println("ID | Tên | số lượng | giá");
        for(MatHang x:listMatHang){
            System.out.println(x);
        }
        System.out.println("-------------------------");
        
        //Them khach hang
        in.nextLine();
        List<KhachHang> listKhachHang = new ArrayList<>();
        System.out.println("Nhập thông tin khách hàng (địa chỉ, tên):");
        listKhachHang.add(new KhachHang(in.nextLine(), in.nextLine()));
        
        //Them Hoa don cho khach hang "Nguyen Van A"
        HoaDon rec = new HoaDon();
        for(KhachHang x:listKhachHang){
            if(x.getTenKH().equals("Nguyễn Văn A")){
                System.out.println("Nhập ngày bán:");
                rec.ThemHoaDon(x, in.nextLine());
                break;
            }
        }
        //them MatHangMua cho hoa don
        List<MatHangMua> listMatHangMua = new ArrayList<>();
        int tongTien = 0;
        for(MatHang x:listMatHang){
            if(x.getTenMatHang().equals("X") || x.getTenMatHang().equals("Y")){
                MatHangMua a = new MatHangMua();
                System.out.println("Nhập số lượng lô hàng mua:");
                a.ThemMatHangMuaCuaHoaDon(rec, x.getMatHangID(), x, in.nextInt());
                tongTien += a.getSoLuong()*a.getMatHang().getGia();
                listMatHangMua.add(a);
            }
        }
        rec.setTongTien(tongTien);
        
        //in ra thong tin hoa don + cac mat hang mua Nguyen Van A
        System.out.println("Thông tin hóa đơn:");
        System.out.println("ID | tênKH | ngày bán | tổng tiền");
        rec.InHoaDon();
        System.out.println("-------------------------");
        System.out.println("Các mặt hàng mua của hóa đơn:");
        System.out.println("ID | tên | số lượng | giá lô hàng");
        for(MatHangMua x:listMatHangMua){
            if(x.getHoaDon().getHoaDonID() == rec.getHoaDonID()) System.out.println(x);
        }
        
    }
}

/*
3
X
5
10000
Y
7
6000
Z
3
20000
HaNoi
Nguyễn Văn A
19/08/2024
3
5
*/