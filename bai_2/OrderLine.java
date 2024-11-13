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
public class OrderLine {
    private static int cnt = 1;
    private String id;
    private double value;
    private Currency unit = Currency.getInstance("VND");
    private NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
    
    public OrderLine(double value){
        this.id = String.format("OL%02d", cnt++);
        this.value = value;
    }
    
    public double getValue(){
        return this.value;
    }
    
    public void setValue(int value){
        this.value = value;
    }
    
    public String getId(){
        return this.id;
    }
    
    @Override
    public String toString(){
        return id+" "+currencyFormatter.format(value);
    }
}
