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
public class MyString2 {
    
    private char[] value;
    
    public MyString2(String s){
        this.value = s.toCharArray(); 
    }

    public int compare(MyString2 s) {
        for(int i = 0; i < value.length; i++){
            if(value[i] != s.toChars()[i]){
                return 0;
            }
        }
        return 1;
    }

    public MyString2 toUppercase() {
        char[] temp = new char[value.length];
        for (int i = 0; i < value.length; i++) {
            temp[i] = Character.toUpperCase(value[i]);
        }
        return new MyString2(new String(temp));
    }

    public static MyString2 valueOf(boolean d) {
        if (d) {
            return new MyString2("true");
        } else {
            return new MyString2("false");
        }
    }

    public MyString2 substring(int begin) {
        char[] temp = new char[value.length - begin];
        for (int i = begin; i < value.length; i++) {
            temp[i - begin] = value[i];
        }
        return new MyString2(new String(temp));
    }

    public char[] toChars() {
        return value;
    }
}
