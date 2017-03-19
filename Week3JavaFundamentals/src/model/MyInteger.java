package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Morgan
 */
public class MyInteger {
    private int value;
    
    public MyInteger(int value){
        this.value = value;
    }
    
    public int getInteger(){
        return value;
    }
    
    public boolean isEven(){
        return MyInteger.isEven(value);
    }
    
    public boolean isOdd(){
        return MyInteger.isOdd(value);
    }
    
    public boolean isPrime(){
        return MyInteger.isPrime(value);
    }
    
    public static boolean isEven(int num){
        if(num%2 == 0){
            return true;
        }
        return false;
    }
    
    public static boolean isOdd(int num){
        if(num%2 == 1){
            return true;
        }
        return false;
    }
    
    public static boolean isPrime(int num){
        for(int i = 2; i < Math.sqrt(num); i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static boolean isEven(MyInteger num){
        return MyInteger.isEven(num.getInteger());
    }
    
    public static boolean isOdd(MyInteger num){
        return MyInteger.isOdd(num.getInteger());
    }
    
    public static boolean isPrime(MyInteger num){
        return MyInteger.isPrime(num.getInteger());
    }
    
    public boolean equals(int num){
        return (num == value);
    }
    
    public boolean equals(MyInteger num){
        return (num.getInteger() == value);
    }
    
    public static int parseInt(char[] charInt){
        int num = 0;
        for(int i = 0; i < charInt.length; i++){
            num *= 10;
            num += Character.getNumericValue(charInt[i]);
        }
        return num;
    }
    
    public static int parseInt(String stringInt){
        return MyInteger.parseInt(stringInt.toCharArray());
    }
}
