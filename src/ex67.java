
import java.util.Scanner;

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
public class ex67 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Count from: ");
        int from = s.nextInt();
        System.out.print("Count to: ");
        int to = s.nextInt();
        System.out.print("Count by: ");
        int by = s.nextInt();
        for(int i = to;i<=from;i+=by)
        {
            System.out.print(i +"\t");
        }
        
    }
}
