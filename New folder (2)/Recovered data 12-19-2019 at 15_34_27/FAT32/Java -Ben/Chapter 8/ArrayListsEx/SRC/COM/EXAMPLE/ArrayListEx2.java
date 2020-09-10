package com.example;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListEx2 {
    public static void main(String args[]) {
        ArrayList<Integer> numbers = new ArrayList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);        
        ListIterator<Integer> litr = numbers.listIterator();

while(litr.hasNext()){
    System.out.println("Number is " +litr.next() );
}
        numbers.remove(1);
        numbers.remove(2);
        numbers.remove(3);
        System.out.println("Even numbers removed:\n"+numbers);
        
        
        
        
         
    }
}
