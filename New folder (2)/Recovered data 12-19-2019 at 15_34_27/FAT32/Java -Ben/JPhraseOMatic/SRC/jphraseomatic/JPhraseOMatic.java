
package jphraseomatic;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class JPhraseOMatic {
        public static void main(String[] args) {
    
    SwingUtilities.invokeLater(new Runnable(){
    public void run(){
        
    JFrame frame = new PhraseFrame("Phrase O Matic!");    
    frame.setSize(600, 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
            }    
        
    });
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
