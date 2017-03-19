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
public class Student extends Person{
    
    private final String STATUS;

    public Student(String classStatus, String name, String address, String phone, String email) {
        super(name, address, phone, email);
        this.STATUS = classStatus;
    }

    public String getSTATUS() {
        return STATUS;
    }
    
    @Override
    public String toString(){
        return this.getClass().getName() + " - " + getName();
    }
    
}
