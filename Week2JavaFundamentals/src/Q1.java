
import java.util.Scanner;

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
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int n = userInput.nextInt();
        //loop through each row
        for(int r = 1; r <= n; r++){
            //print the preceding spaces
            for(int c = n; c > r; c--){
                //check for double digit
                if(c > 9){
                    System.out.print("   ");
                } else {
                    System.out.print("  ");
                }
            }
            
            //print left side of pyramid
            for(int c = r; c >= 1; c--){
                System.out.print(" " + c);
            }
            
            //print right side of pyramid
            for(int c = 2; c <= r; c++){
                System.out.print(" " + c);
            }
            
            //Start a new line
            System.out.println();
        }
    }
}
