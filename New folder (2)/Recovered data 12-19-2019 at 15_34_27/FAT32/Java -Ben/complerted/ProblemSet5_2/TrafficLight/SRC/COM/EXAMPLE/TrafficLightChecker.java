
package com.example;
import java.util.Scanner;

public class TrafficLightChecker {

    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a color code");
    int currentColor = sc.nextInt();
    
    if(currentColor == 1){System.out.println("The next traffic light is Green");}
    else if(currentColor == 2){System.out.println("The next traffic light is Yellow");}
    else if(currentColor == 3){System.out.println("The next traffic light is Red");}
    else if (currentColor != 1 && currentColor != 2 && currentColor != 3){
        System.out.println("Thats not a valid color code :(");}
                
        
        
        
        
        
        
        
        
        
        
        
    }

}
