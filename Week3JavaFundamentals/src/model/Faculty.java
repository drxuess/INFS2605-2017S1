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
public class Faculty extends Employee {
    private double officeHours;
    private String rank;

    public Faculty(double officeHours, String rank, String office, double salary, MyDate hireDate, String name, String address, String phone, String email) {
        super(office, salary, hireDate, name, address, phone, email);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public double getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(double officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    
    @Override
    public String toString(){
        return this.getClass().getName() + " - " + getName();
    }
}
