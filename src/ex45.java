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

public class ex45 {
    
    public static void main(String[] args)
    {
    
    Random a= new Random();
    int firstRoll = a.nextInt(6)+1;
    int secondRoll = a.nextInt(6)+1;
    
    System.out.println("Rolling dice .......");
    System.out.printf("Roll #1 = %d\nRoll #2 = %d\nThe sum is %d\n",firstRoll,secondRoll,firstRoll+secondRoll);
    
    }
    
}
