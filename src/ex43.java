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
public class ex43 {
    
    public static void main (String[] args[])
    {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        System.out.println("Pick a number from 1 to 10");
        int rand = 1+r.nextInt(10);
        
        System.out.println("your guess: ");
        int guess = s.nextInt();
        
        if (rand != guess)
       
            System.out.println("YOur answer is wrong, The correct guess is " + rand);
        else
        {
            System.out.println("You guessed right :)");
        }
        
        
    }
    
}
