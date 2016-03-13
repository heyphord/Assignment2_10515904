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
public class ex62 {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int collatz,max,count=0;
        System.out.println("Enter Starting number: ");
        collatz = s.nextInt();
        max = collatz;
        
        System.out.print(collatz + "\t");
        while(collatz != 1)
        {
            if(collatz%2 == 0)
               collatz = collatz/2;
            else
                collatz = 3*collatz +1;
            
            if (max<collatz)
                max = collatz;
            
            count++;
            
            System.out.printf("%d\t",collatz);
        }
      
        System.out.println("\nThe Largest value was "+max + "\n Terminated after "+ count + " steps");
    }
}
