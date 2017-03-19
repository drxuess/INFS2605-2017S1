/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Morgan
 */
public class Employee extends Person{
    
    private String office;
    private double salary;
    private final MyDate hireDate;

    public Employee(String office, double salary, MyDate hireDate, String name, String address, String phone, String email) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString(){
        return this.getClass().getName() + " - " + getName();
    }
}
