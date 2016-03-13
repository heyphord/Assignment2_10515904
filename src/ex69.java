/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author heyphord
 */
public class ex69 {
    
    public static void main( String[] args )
    {
        
        float x,y;
        System.out.println( "x\ty");
        System.out.println("................");
        for (  x = -10 ; x <= 10; x = x+0.5f )
        {
            y = x*x;
            System.out.println( x+"\t"+ y );
        }

    }
}
