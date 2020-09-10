
package jswingfun;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class JSwingFun {

 
    public static void main(String[] args) {
    
    
    SwingUtilities.invokeLater(new Runnable(){
    
    public void run(){
        
    JFrame frame = new JFrame("Hello World Swing!");    
    frame.setSize(950, 1000);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
            }    
        
    });
        


    }
    
}
