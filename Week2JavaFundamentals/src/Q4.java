
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
public class Q4 {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[] array = new double[10];
        for(int i = 0; i < 10; i++){
            double n = userInput.nextDouble();
            array[i] = n;
        }
        System.out.println("The minimum number is: " + min(array));
    }
    
    public static double min(double[] array){
        double min = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < i){
                min = array[i];
            }
        }
        return min;
    }
    
}
