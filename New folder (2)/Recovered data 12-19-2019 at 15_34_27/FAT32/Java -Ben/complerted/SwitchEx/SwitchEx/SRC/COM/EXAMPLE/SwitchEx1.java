
package com.example;
import java.util.Scanner;


public class SwitchEx1 {

   
    
    public static void main(String args[]) {
   
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the number of month it is");
    int moth = sc.nextInt();
    
    int runit = 2;
   while (runit == 2){
    switch (moth) {
        case 1: System.out.println("So its January"); runit = 1;
            break;
        case 2: System.out.println("So its February"); runit = 1;
            break;
        case 3: System.out.println("So its March"); runit = 1;
            break;
        case 4: System.out.println("So its April"); runit = 1;
            break;
        case 5: System.out.println("So its May"); runit = 1;
            break;
        case 6: System.out.println("So its June"); runit = 1;
            break;
        case 7: System.out.println("So its July"); runit = 1;
            break;
        case 8: System.out.println("So its August"); runit = 1;
            break;
        case 9: System.out.println("So its September"); runit = 1;
            break;
        case 10: System.out.println("So its October"); runit = 1;
            break;
        case 11: System.out.println("So its November"); runit = 1;
            break;
        case 12: System.out.println("So its December"); runit = 1;
            break;
        
    default: System.out.println("Thats not a month number silly, try again");
    moth = sc.nextInt();
            }
   
        }
   
    
   
    }
}
