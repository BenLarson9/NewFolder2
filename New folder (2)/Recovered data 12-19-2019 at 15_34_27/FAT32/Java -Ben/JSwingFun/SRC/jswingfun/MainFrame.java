package jswingfun;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {

    public MainFrame(String title){
    
        super(title);
    // set layout manager    
          setLayout(new BorderLayout());  
        
    
    // create swing component
    JTextArea textArea = new JTextArea();
    JButton button = new JButton("Click Me!");
    
    
    // add swing components to content pane
    Container c = getContentPane();
    c.add(textArea, BorderLayout.CENTER);
    c.add(button, BorderLayout.SOUTH);
    
    // add a behavior
    button.addActionListener(new ActionListner(){
   
    @Override
    public void actionPerformed(ActionEvent e){
        testArea.append("Hello\n");
             }
        });
    
    }

    
        

    




    
}
