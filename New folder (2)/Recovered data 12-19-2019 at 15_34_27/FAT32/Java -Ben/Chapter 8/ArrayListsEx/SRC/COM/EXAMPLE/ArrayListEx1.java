package com.example;

import java.util.ArrayList;


public class ArrayListEx1 {

   
    public static void main(String[] args) {
        ArrayList <String> students = new ArrayList();
        students.add("Amy");
        students.add("Bob");
        students.add("Cindy");
        students.add("David");
        
        System.out.println("Array list size is "+students.size()+"\nIt contains:\n"+students);

    }
    
}
