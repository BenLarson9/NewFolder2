package com.example;

import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your pin: ");
        int rpin = 5674;
        int npin = sc.nextInt();
        
        while(npin != rpin){
            System.out.println("That is not correct");
            System.out.println("Please enter your pin: ");
            npin = sc.nextInt();
         }
        System.out.println("That is correct. Access granted");
        
    }
}
