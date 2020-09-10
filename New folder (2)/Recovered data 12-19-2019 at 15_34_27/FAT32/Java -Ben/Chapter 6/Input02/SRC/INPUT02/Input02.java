package input02;

import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "Windows Defender has locatd a Virus on your computer, "
              + "Please call Microsoft support at: (222)-615-6093 " ,
                "Critical Alert From Microsoft",
                1);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "Welcome to your Bank Teller Interview, Is there any specific reason we "
                        + "should hire you?",
                "Job Interview",
                3,
                null,
                null,
                "You'll be hired anyways");
        
        
        String[] acceptableValues = {"Follow Orders", "Don't Follow Orders", "Call Police and get Shot"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Put the Money in The Bag",
                "This is a Stick Up!",
                0,
                null,
                acceptableValues,
                acceptableValues[0]);
        
                
    }
}