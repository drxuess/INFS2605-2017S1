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
public class Staff extends Employee{
    private String title;

    public Staff(String title, String office, double salary, MyDate hireDate, String name, String address, String phone, String email) {
        super(office, salary, hireDate, name, address, phone, email);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString(){
        return this.getClass().getName() + " - " + getName();
    }    
}
