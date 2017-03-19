
import model.MyInteger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Morgan
 */
public class Q1 {
    public static void main(String[] args){
        MyInteger myInt = new MyInteger(23);
        System.out.println(myInt.getInteger());
        System.out.println(myInt.isEven());
        System.out.println(myInt.isOdd());
        System.out.println(myInt.isPrime());
        
        System.out.println(MyInteger.isEven(100));
        System.out.println(MyInteger.isOdd(26));
        System.out.println(MyInteger.isPrime(36));
        
        System.out.println(MyInteger.isEven(new MyInteger(100)));
        System.out.println(MyInteger.isOdd(new MyInteger(26)));
        System.out.println(MyInteger.isPrime(new MyInteger(36)));
        
        System.out.println(myInt.equals(23));
        System.out.println(myInt.equals(new MyInteger(23)));
        
        System.out.println(MyInteger.parseInt(new char[]{'1', '0', '3', '4'}));
        System.out.println(MyInteger.parseInt("1234"));
    }
}
