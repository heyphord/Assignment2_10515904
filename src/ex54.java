/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author heyphord
 */
import java.util.Random;
import java.util.Scanner;
public class ex54 {
    
     public static void main(String args[])
    {
         Random r = new Random();
        Scanner s = new Scanner(System.in);
        System.out.println("Pick a number from 1 to 100");
        int rand = 1+r.nextInt(100);
        
        System.out.println("your guess: ");
        int guess = s.nextInt();
        int count =1;
        
        while ((guess != rand)  && (count <7))
        {
            if(guess > rand)
                System.out.println("Too high");
            else
            { System.out.println("Too low");}
                System.out.println("Please guess again: ");
            guess = s.nextInt();
            count++;
        }
       
        
       if(guess == rand)
            System.out.println("You guessed right :)");
    }
    
}
