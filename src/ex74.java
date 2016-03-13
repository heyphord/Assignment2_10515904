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
public class ex74 {
    
    public static void main(String[] args)
    {
        int num, sum=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your number");
        num = s.nextInt();
        for(int j =1; j<num;j++)
        {System.out.println(j+" +");
            sum+=j;
        }
            System.out.print("The sum is "+ sum);
    }
}
