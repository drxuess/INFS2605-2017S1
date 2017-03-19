
import model.MyStringBuilder1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Morgan
 */
public class Q3 {

    public static void main(String[] args) {
        MyStringBuilder1 s1
                = new MyStringBuilder1(new char[]{'a', 'b', 'c', 'd', 'p'});
        MyStringBuilder1 s2 = new MyStringBuilder1("xyz");

        System.out.println(s1.length());
        System.out.println(s1.charAt(3));

        s2.append(123456789);

        System.out.println(s2.toString());
        System.out.println(s1.substring(1, 2));

        System.out.println(s1.toLowerCase().toString());
    }
}
