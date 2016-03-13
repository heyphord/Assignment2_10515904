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
public class ex55 {
    
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int count =0;
        int temp;
        
        System.out.println("Please enter your integer: ");
        temp = s.nextInt();
        count+= temp;
        System.out.println("The sum is: "+ count);
       
        while(temp != 0)
        {
            
            System.out.println("Please enter your integer: ");
            temp = s.nextInt();
            count+= temp;
            System.out.println("The sum is: "+ count);
        }
    }
}
