/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_2;

import java.util.*;
import java.text.NumberFormat;

/**
 *
 * @author huyle
 */
public class Order {
    private static int cnt = 1;
    private String id;
    private Customer customer;
    private List<OrderLine> orderLine;
    private double total;
    private Currency unit = Currency.getInstance("VND");
    private NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
    
    public Order(Customer customer){
        this.id = String.format("OR%02d", cnt++);
        this.customer = customer;
        this.orderLine = new ArrayList<>();
        this.total = 0;
    }
    
    public String getId(){
        return id;
    }
    
    public Customer getCustomer(){
        return customer;
    }
    
    public List getOrderLineList(){
        return orderLine;
    }
    
    public double getTotal(){
        return total;
    }
    
    public void addLine(OrderLine b){
        orderLine.add(b);
        this.total+=b.getValue();
    }
    
    public void removeLine(int index){
        this.total-=orderLine.get(index-1).getValue();
        this.orderLine.remove(index-1);
    }
    
    @Override
    public String toString(){
        String res = "Mã hóa đơn: "+id+"\n";
        res+="Tên khách hàng: "+customer.getName()+"\n";
        res+="danh sách mặt hàng:\n";
        for(OrderLine x:orderLine){
            res+=x.toString()+"\n";
        }
        res+="Tổng tiền: "+currencyFormatter.format(total);
        return res;
    }
}
