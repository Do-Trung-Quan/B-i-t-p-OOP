/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_2;

/**
 *
 * @author huyle
 */
public class Customer {
    private static int cnt = 1;
    private String address;
    private String code;
    private String name;
    
    public Customer(String address,String name){
        this.address = address;
        this.code = String.format("KH%02d", cnt++);
        this.name = name;
    }
    
    //start of get/set
    public String getAddress(){
        return this.address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getCode(){
        return this.code;
    }
    
    public void setCode(String code){
        this.code = code;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    //end of get/set
    
    @Override
    public String toString(){
        return code+" "+name+" "+address;
    }
}
