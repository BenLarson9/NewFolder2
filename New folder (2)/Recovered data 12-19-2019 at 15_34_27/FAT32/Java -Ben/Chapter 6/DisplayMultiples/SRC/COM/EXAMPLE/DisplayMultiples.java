package com.example;

import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {
        
        System.out.println("Please enter a number: ");
        Scanner sc = new Scanner(System.in);
        int cancer = sc.nextInt();
        int ultiple = 0;
        
        System.out.println("\nThe Multiples of that number are:" );
        
        for(int i = 1; i < 13; i++){
            ultiple = cancer * i;
            System.out.println(ultiple); 
            
        }
        
    }

}
