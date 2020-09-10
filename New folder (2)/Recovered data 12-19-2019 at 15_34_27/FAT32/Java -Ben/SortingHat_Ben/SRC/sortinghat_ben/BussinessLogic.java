package sortinghat_ben;

import javax.swing.JOptionPane;
import java.util.Random;
import javax.swing.ImageIcon;

class BussinessLogic {

    String nothing = " ";
    String userName = " ";
    Random rand = new Random();
    String GetUserName() {
        
        userName = JOptionPane.showInputDialog("Please enter your name", "What is Your First Name?");

        return userName;
    }

    int GetRNDNum() {
        return (rand.nextInt(4)+1);    
    }

    String GetHouse(int houseNum, String houseName) {
        houseName = "";
       switch(houseNum){
            case 1: houseName = "Slitherin";
            case 2: houseName = "Ravenclaw";
            case 3: houseName = "Hufflepuff";
            case 4: houseName = "Gryffindor";
        
      } 
      return houseName;
      
    }
    
    
}  
    
