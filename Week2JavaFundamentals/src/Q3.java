
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
public class Q3 {
    public static void main(String args[]){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100: ");
        int[] count = new int[101];
        int n = userInput.nextInt();
        while(n != 0){
            count[n] += 1;
            n = userInput.nextInt();
        }
        for(int i = 1; i <= 100; i++){
            if(count[i] > 1){
                System.out.println(i + " occurs " + count[i] + " times.");
            } else if(count[i] == 1){
                System.out.println(i + " occurs 1 time.");
            }
        }
    }
}
