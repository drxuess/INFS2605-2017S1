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
    
    private static final int N = 6;
    
    public static void main(String args[]){
        patternA();
        patternB();
        patternC();
        patternD();
    }
    
    public static void patternA(){
        System.out.println("PatternA");
        for(int r = 1; r <= N; r++){
            for(int c = 1; c <= r; c++){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
    
    public static void patternB(){
        System.out.println("PatternB");
        for(int r = N; r >= 1; r--){
            for(int c = 1; c <= r; c++){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
    
    public static void patternC(){
        System.out.println("PatternC");
        for(int r = 1; r <= N; r++){
            //print spaces
            for(int c = r; c < N; c++){
                System.out.print("  ");
            }
            for(int c = r; c >= 1; c--){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
    
    public static void patternD(){
        System.out.println("PatternD");
        for(int r = N; r >= 1; r--){
            //print spaces
            for(int c = r; c < N; c++){
                System.out.print("  ");
            }
            for(int c = 1; c <= r; c++){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
