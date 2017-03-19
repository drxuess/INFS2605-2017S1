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
public class MyStringBuilder1 {
    private char[] buffer;
    
    public MyStringBuilder1(){
        
    }
    
    public MyStringBuilder1(String s){
        buffer = s.toCharArray();
    }
    
    public MyStringBuilder1(char[] s){
        buffer = s;
    }
    
    public MyStringBuilder1 append(MyStringBuilder1 s){
        char[] temp = new char[buffer.length + s.length()];
        for(int i = 0; i < buffer.length; i++){
            temp[i] = buffer[i];
        }
        for(int i = buffer.length; i < buffer.length + s.length(); i++){
            temp[i] = s.charAt(i - buffer.length);
        }
        return new MyStringBuilder1(temp);
    }
    
    public MyStringBuilder1 append(int i){
        return append(new MyStringBuilder1(String.valueOf(i)));
    }
    
    public int length(){
        return buffer.length;
    }
    
    public char charAt(int index){
        return buffer[index];
    }
    
    public MyStringBuilder1 toLowerCase() {
        for (int i = 0; i < buffer.length; i++) {
            buffer[i] = Character.toLowerCase(buffer[i]);
        }
        return this;    
    }
    
    public MyStringBuilder1 substring(int begin, int end) {
        char[] result = new char[end - begin];
        for (int i = 0; i < result.length; i++) {
            result[i] = buffer[begin + i];
        }

        return new MyStringBuilder1(result);
    }
    
    @Override
    public String toString() {
        return new String(buffer);
    }
}
