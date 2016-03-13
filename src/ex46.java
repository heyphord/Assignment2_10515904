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
public class ex46 {
    
    public static void main(String args[])
    {
         Random r = new Random();
        Scanner s = new Scanner(System.in);
        System.out.println("Pick a number from 1 to 100");
        int rand = 1+r.nextInt(100);
        
        System.out.println("your guess: ");
        int guess = s.nextInt();
        
        if (guess > rand)
       
            System.out.println("Too high, The correct guess is " + rand);
        else if (guess < rand)
            System.out.println("Too low, The correct guess is \" + rand");
        else
       
            System.out.println("You guessed right :)");
    }
}
