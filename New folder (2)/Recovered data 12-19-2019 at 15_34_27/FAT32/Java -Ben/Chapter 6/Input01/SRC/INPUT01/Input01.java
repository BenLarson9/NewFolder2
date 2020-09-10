package input01;

import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.
        String input = JOptionPane.showInputDialog("Type Something");
        
        System.out.println(input);
        //Parse the input as an int.
        //Print its value +1
        int number1 = Integer.parseInt(input);
        System.out.println(number1 + 1);
        
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.
        
        int number2 = Integer.parseInt(JOptionPane.showInputDialog
        (" Please enter a number ")); 
              
        System.out.println(number2);
                 
    }
}
