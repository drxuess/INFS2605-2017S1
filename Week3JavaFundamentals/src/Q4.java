
import model.Employee;
import model.MyDate;
import model.Person;
import model.Student;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Morgan
 */
public class Q4 {
    public static void main(String[] args){
        Person person = new Person("John Smith", "", "", "");
        Student student = new Student("", "Jennifer Jones", "", "", "");
        Employee employee = new Employee("", 0, new MyDate() , "Paul Gareth", "", "", "");
        
        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
    }
}
