package com.example;

import java.util.Scanner;

public class ComputeAvg {

    public static void main(String args[]) {
       int[] scores = new int[5];
       String[] test = new String[5];      
       Scanner sc = new Scanner(System.in);
       int average = 0;
       int j;
       for(int i = 0; i  < 5; i++){
           i++;
           System.out.println("Please enter the score for test "+i+" out of 100");
           i--;
           scores[i] = sc.nextInt();
           
       }
       for(j = 0; j < scores.length; j++) {
       average += scores[j];
       }
       average/=j;
        System.out.println("the average test score is: " + average);
    }

}
