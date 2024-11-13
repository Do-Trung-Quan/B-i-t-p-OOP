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
public class OrderList {
    private List<Order> orderList;
    public OrderList(){
        this.orderList = new ArrayList<>();
    }

    public void add(Order b){
        this.orderList.add(b);
    }
    
    public void remove(Order b){
        this.orderList.remove(b);
    }
    
    public int getCount(){
        return orderList.size();
    }
    
    public List<Order> getIterator(){
        return this.orderList;
    }
}
