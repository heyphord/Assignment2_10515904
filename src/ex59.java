/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author heyphord
 */
import java.util.Scanner;
import java.util.Random;
public class ex59 {
    
    public static void main(String args[])
    {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int rand,guess,count;
        do{
             System.out.println("Pick a number from 1 to 10");
         rand = 1+r.nextInt(10);
       
        
        System.out.println("your guess: ");
         guess = s.nextInt();
          count = 1;
        }
        while((rand != guess) &&  count <7);
       
        
    }
    
}
