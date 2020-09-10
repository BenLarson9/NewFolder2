
package com.example;
import java.util.Scanner;

public class NameMaker {
    
    public static void main(String args[]){
        Scanner names = new Scanner(System.in);
        
        
        System.out.println("Please enter your first name: ");
        String firstName = names.nextLine();
        
        System.out.println("Please enter your middle name: ");
        String middleName = names.nextLine();
        
        System.out.println("Please enter your last name: ");
        String lastName = names.nextLine();
        
        
        String fullName = firstName+" "+middleName +" "+lastName;
        System.out.println("So your name is " + fullName);   
    }
    
}
