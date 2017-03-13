
import java.util.Arrays;
import java.util.Random;
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
public class Q5 {
    public static void main(String[] args){
        //Get some words
        //String[] wordList = {"write", "that", "program"};
        final String[] wordList = Util.readFromFile("lib/dict.txt");
        String cmd = "y";
        Scanner userInput = new Scanner(System.in);
        
        //while player still wants to continue
        while(cmd.equals("y")){
            //grab a random word
            Random rg = new Random();
            int randInt = rg.nextInt(wordList.length);
            String answer = wordList[randInt];
            
            //generate a masked out asterisk guess
            char[] array = new char[answer.length()];
            Arrays.fill(array, '*');
            String maskedAnswer = new String(array);
            
            //to count the misses (double if you think youll make a lot of mistakes)
            int misses = 0;
            
            //while maskedAnswer is not the same as answer
            while(!maskedAnswer.equals(answer)){
                System.out.print("(Guess) Enter a letter in word " + maskedAnswer + " > ");
                String guess = userInput.next();
                
                //test guess vs word
                if(maskedAnswer.contains(guess)){
                    System.out.println(guess + " is already in the word");
                } else if(answer.contains(guess)){
                    char[] replace = maskedAnswer.toCharArray();
                    for(int i = 0; i < answer.length(); i++){
                        if(answer.charAt(i) == guess.charAt(0)){
                            replace[i] = answer.charAt(i);
                        }
                    }
                    maskedAnswer = new String(replace);
                } else {
                    System.out.println(guess + " is not in the word");
                    misses += 1;
                }
            }
            
            if(misses == 1){
                System.out.println("The word is " + answer + ". You missed 1 time");
            } else {
                System.out.println("The word is " + answer + ". You missed " + misses + " times");
            }
            
            System.out.print("Do you want to guess another word? Enter y or n> ");
            cmd = userInput.next();
            while(!"yn".contains(cmd)){
                System.out.print("Enter y or n> ");
                cmd = userInput.next();
            }
        }
    }
    
}
