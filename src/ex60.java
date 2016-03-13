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
public class ex60 {
    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Enter a number to calculate its square root");
        n= s.nextInt();
        while(n<0)
        {
            System.out.println("Please you cant enter a negative number, input a positive value\n");
            n= s.nextInt();
        }
        while(n>=0)
        {
            System.out.printf("The square root of %d is %.5f\n",n,Math.sqrt(n));
            System.out.println("Enter a number to calculate its square root");
        n= s.nextInt();
        
        }
       
    }
}
