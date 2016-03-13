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
public class ex66 {
    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your integer: ");
        int num = s.nextInt();
        for(int i = 1;i<=num;i++)
        {
            System.out.print(i +"\t");
        }
        
    }
}
