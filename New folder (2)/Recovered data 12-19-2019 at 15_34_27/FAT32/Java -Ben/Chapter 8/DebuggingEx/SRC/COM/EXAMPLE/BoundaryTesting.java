
package com.example;

public class BoundaryTesting {

    public static void main(String args[]) {
        int CALENDAR_START = 1583; //this doesnt work because its set to start at 1583 not 82
        int year = 1582;
        int month = 2;
        // validate input 
        if ((year < CALENDAR_START) || (month < 1) || (month > 12)) {
            System.out.println("Bad request: " + year + " " + month);
        }

    }

}
