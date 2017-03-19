
import model.MyString2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Morgan
 */
public class Q2 {
    public static void main(String[] args){
        MyString2 myString = new MyString2("Testing String");
        MyString2 myString2 = new MyString2("Testing String");
        
        System.out.println(myString.compare(myString2));
        System.out.println(myString.substring(2).toChars());
        System.out.println(myString.toUppercase().toChars());
        System.out.println(myString.toChars());
        System.out.println(MyString2.valueOf(true).toChars());
        System.out.println(MyString2.valueOf(false).toChars());
    }
}
