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
public class ex44 {
    
    public static void main(String args[])
    {
         Random r = new Random();
        Scanner s = new Scanner(System.in);
        System.out.println("Choose your fortune from one to siz (1-6)");
        int rand = 1+r.nextInt(6);
        
        System.out.print("your guess: ");
        int guess = s.nextInt();
        
        if (rand == 1 )
                System.out.println("You'll meet your best friend today");
        else if (rand == 2)
            System.out.println("YOu'll get an 'A' in this course");
        else if (rand == 3)
            System.out.println("You'll have to work hard man");
        else if (rand == 4)
            System.out.println("YOu'll get an 'D' in this course");
        else if (rand == 5)
            System.out.println("Today will be a good day bro");
        else if (rand == 6)
            System.out.println("Today you meet the love of your life :)");
            
        else
        {
            System.out.println("You guessed right :)");
        }
    }
}
