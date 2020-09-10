/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalex;

import java.util.Scanner;

/**
 *
 * @author anshenoy
 */
public class WatchMovie {

    public static void main(String args[]) {
        System.out.println("Enter the movie ticket price ");
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        System.out.println("\nHow many stars is it rated? ");
        int rate = sc.nextInt();
        
        String interest = "";
        
        if (price >= 12){
            if (rate >= 5){interest = "I'm interested in watching the movie.";}
            else if (rate <5){interest = "I am not interested in watching the movie.";}
        }
        
        else if (price < 12){
        interest = "I am not interested in watching the movie.";
        }        
        
        System.out.println("\n" + interest);
  
        
        
        
    }
}
