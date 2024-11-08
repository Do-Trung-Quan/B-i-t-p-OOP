/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_1;

/**
 *
 * @author huyle
 */
public class PartTimeEmployee extends Employee{
    private final int workingHours;
    public PartTimeEmployee(String name, int paymentPerHour, int workingHours){
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }
    
    @Override
    public int calculateSalary(){
        return workingHours*getPaymentPerHour();
    }
    
    @Override
    public String toString(){
        return getName()+" "+calculateSalary();
    }
}
