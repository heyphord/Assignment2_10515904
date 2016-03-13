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
public class ex61 {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int s1,s2,s3;
        System.out.println("Please enter 3 sides of a triange to check if it is a right angle, the sides entered must be in "
                + "ascending order");
        System.out.println("Input Side 1: ");
        s1 = s.nextInt();
        System.out.println("Input Side 2: ");
        s2 = s.nextInt();
        while(s1>s2)
        {
            System.out.println("Side 1 cannot be greater than side 2, Try again");
            System.out.println("Input Side 2: ");
            s2 = s.nextInt();
        }
        System.out.println("Input Side 3: ");
        s3 = s.nextInt();
        
        while(s2>s3)
        {
            System.out.println("Side 2 cannot be greater than side 3, Try again");
            System.out.println("Input Side 2: ");
            s3 = s.nextInt();
        }
        
        System.out.printf("Your sides are %d %d %d\n",s1,s2,s3);
        System.out.println("Checking if the sides make a right angle triangle......");
        int Left = (s1*s1) + (s2*s2);
        int Right = (s3 * s3);
        if(Left == Right)
        {
            System.out.println("Yes, the sides do make a right angle triangle");
        }
        else
            System.out.println("Sorry buddy, the sides dont make a right angle triangle");
    }
}
