/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_2;
import java.util.*;
/**
 *
 * @author huyle
 */
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Customer> listCustomers = new ArrayList<>();
        System.out.println("Thêm 2 khách hàng vào tập khách hàng: (address/name)");
        listCustomers.add(new Customer(in.nextLine(), in.nextLine()));
        listCustomers.add(new Customer(in.nextLine(), in.nextLine()));
        
        System.out.println("----------------------------");
        System.out.println("Tạo hóa đơn 1 cho khách đầu tiên, thêm 3 orderLine cho hóa đơn 1");
        Order order1 = new Order(listCustomers.get(0));
        order1.addLine(new OrderLine(in.nextDouble()));
        order1.addLine(new OrderLine(in.nextDouble()));
        order1.addLine(new OrderLine(in.nextDouble()));
        System.out.println(order1);
        System.out.println("Xóa orderline thứ 1 trong hóa đơn 1");
        order1.removeLine(1);
        System.out.println(order1);
        
        System.out.println("----------------------------");
        System.out.println("Tạo hóa đơn 2 cho khách thứ 2, thêm 5 orderLine cho hóa đơn 2");
        Order order2 = new Order(listCustomers.get(1));
        order2.addLine(new OrderLine(in.nextDouble()));
        order2.addLine(new OrderLine(in.nextDouble()));
        order2.addLine(new OrderLine(in.nextDouble()));
        order2.addLine(new OrderLine(in.nextDouble()));
        order2.addLine(new OrderLine(in.nextDouble()));
        System.out.println(order2);
        System.out.println("Xóa orderline thứ 2 và 5 trong hóa đơn 2");
        order2.removeLine(2);
        order2.removeLine(4);
        System.out.println(order2);
        
        System.out.println("----------------------------");
        System.out.println("Tạo danh sách hóa đơn và thêm hóa đơn 1, hóa đơn 2:");
        OrderList orderList = new OrderList();
        orderList.add(order1);
        orderList.add(order2);
        System.out.println("số hóa đơn trong danh sách: "+orderList.getCount());
        System.out.println("Các hóa đơn trong danh sách:");
        for(Order x:orderList.getIterator()){
            System.out.println(x.getId());
        }
        System.out.println("Xóa hóa đơn 2 trong danh sách");
        orderList.remove(order2);
        System.out.println("Các hóa đơn trong danh sách:");
        for(Order x:orderList.getIterator()){
            System.out.println(x.getId());
        }
        
    }
}

/*
68 KN HBT Hà Nội
Đỗ Trung Quân
121 NTH HK Hà Nội
Trần Thanh Thúy
12000
50000
25000
45000
69000
153000
9000
456000
*/