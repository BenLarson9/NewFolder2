
package jphraseomatic;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JDialog;

class PhraseFrame extends JFrame {

    public PhraseFrame(String title) {
    super(title);
    
    
// set layout manager    
    setLayout(new BorderLayout());  
  
    
// create swing component
    JTextArea textArea = new JTextArea();
    JButton button = new JButton("What we need is a");
    PrintMe myPrint = new PrintMe();
      
    
// add swing components to content pane
    Container c = getContentPane();
    c.add(textArea, BorderLayout.CENTER);
    c.add(button, BorderLayout.NORTH);
 
    
// add a behavior
    button.addActionListener ( new ActionListener(){
        @Override
        public void actionPerformed (ActionEvent e){
  
        PrintMe myPrint = new PrintMe();
        myPrint.GetHeader();
        MyPhrase newPhrase = new MyPhrase();
        String phrase = newPhrase.GetPhrase();
        myPrint.GetFooter(phrase);

        
        textArea.append("\t" + phrase + "\n");
        }
    });
    
    
    
    
    
    
    
    
    }
    
}
