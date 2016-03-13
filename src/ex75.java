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
public class ex75 {
    public static void main(String[] args)
    {
        int user1,user2, dealer1,dealer2;
        Random r = new Random();
        System.out.println("Baby blackJack");
        user1 = r.nextInt(10)+1;
        user2 = r.nextInt(10)+1;
        dealer1 = r.nextInt();
        dealer2 = r.nextInt();
        
        System.out.println("You drew "+user1+"+ and + "+ user2);
        System.out.println("Your sum is "+ (user1+user2));
        System.out.println();
        System.out.println("Your dealer drew "+dealer1+"+ and + "+ dealer2);
        System.out.println("Your sum is "+ (dealer1+dealer2));
        
        if((user1+user2)>(dealer1+dealer2))
            System.out.println("You Win");
        else
            System.out.println("You lost buddy, sorry");
    }
}
