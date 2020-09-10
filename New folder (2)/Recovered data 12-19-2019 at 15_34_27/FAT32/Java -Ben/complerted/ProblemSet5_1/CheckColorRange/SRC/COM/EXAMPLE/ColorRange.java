/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class ColorRange {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a color wavelength");
        double  colr = sc.nextDouble();
        String color = "color";
        
        if(colr > 380 && colr < 450){color = "Violet";}
        else if(colr > 450 && colr < 495){color = "Blue"; System.out.println("Thats the color " + color);}
        else if(colr > 495 && colr < 570){color = "Green"; System.out.println("Thats the color " + color);}
        else if(colr > 570 && colr < 590){color = "Yellow"; System.out.println("Thats the color " + color);}
        else if(colr > 590 && colr < 620){color = "Orange"; System.out.println("Thats the color " + color);}
        else if(colr > 620 && colr < 750){color = "Red"; System.out.println("Thats the color " + color);}
        else if(colr < 450){System.out.println("Thats not a color in the visible wavelength");}
        else if(colr > 750){System.out.println("Thats not a color in the visible wavelength");}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        }
    }
