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
public class ex47 {
    
    public static void man(String args[])
    {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        System.out.println("There's a ball in one of the three cups, choose the cup with the ball");
        int rand = r.nextInt();
        System.out.print("Please select your cup\nCup #:");
        int guess = s.nextInt();
        
        if (guess == rand)
            System.out.println("You guessed right");
        else
            System.out.println("You guessed wrong");    
    }
}
