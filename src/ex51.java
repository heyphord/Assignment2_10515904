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
public class ex51 {
    
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);

		System.out.println( "Type in a message, and I'll display it five times." );
		System.out.print( "Message: " );
		String message = keyboard.nextLine();
                System.out.print("How many time do you want to print the message?: ");
                int count = keyboard.nextInt();
		int n = 0;
		while ( n < count )
		{
			System.out.println( (10*(n+1)) + ". " + message );
			n++;
		}
    }
}
