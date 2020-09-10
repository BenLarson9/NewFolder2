package sortinghat_ben;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


class Message {

    void GetStartScreen() {
        //Set Icon
        String myPic = "Hogwartscrest.png";
        
        ImageIcon iconHouse = new ImageIcon(sortinghat_ben.Message.class
            .getResource(myPic));
        
        JOptionPane.showMessageDialog(null, "Press OK to Begin", 
            "Hogwart's Sorting Hat", JOptionPane.PLAIN_MESSAGE, iconHouse);
      
    }

    void DisplayHouse(String houseName, int houseNum, String userName) {
       String image = "Sytherin.png";
       
    switch (houseNum){
        case 1: 
            image = "Slytherin.png"; 
            break;
        case 2:
            image = "Slitherin.png"; 
            break;
        case 3:
            image = "HufflePuff.jpg";
            break;
        case 4:
            image = "Gryffindor.jpg";
            break;
    }
        
        ImageIcon iconHouse1 = new ImageIcon(sortinghat_ben.Message.class.getResource(image));
        JOptionPane.showMessageDialog(null, userName+  " belongs in " + houseName + "'s house.", "Hogwarts's Sorting Hat", JOptionPane.PLAIN_MESSAGE, iconHouse1);

     
        }
        
        
}
    
    
    
    
    
    
    
    

