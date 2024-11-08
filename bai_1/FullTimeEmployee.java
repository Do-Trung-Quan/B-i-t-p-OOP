/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_1;

/**
 *
 * @author huyle
 */
public class FullTimeEmployee extends Employee{
    public FullTimeEmployee(String name, int paymentPerHour){
        super(name, paymentPerHour);
    }
    
    @Override
    public int calculateSalary(){
        return getPaymentPerHour();
    }
    
    @Override
    public String toString(){
        return getName()+" "+calculateSalary();
    }
}
