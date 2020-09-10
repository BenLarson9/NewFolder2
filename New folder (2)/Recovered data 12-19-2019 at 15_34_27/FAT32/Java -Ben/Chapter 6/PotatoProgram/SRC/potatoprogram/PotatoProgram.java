
package potatoprogram;
import java.util.Scanner;

public class PotatoProgram {

    
    public static void main(String[] args) {
    
        Scanner myScan = new Scanner(System.in);
        System.out.println("How do you correctly spell Potato(e)? (Potato or Potatoe)");    
    
    String answer = myScan.nextLine();
    
    if (answer.equals("Potato")){
    System.out.println("YOU ARE WRONG! \n-100 points");
    }
    
    
    if (answer.equals("Potatoe")){
    System.out.println("You are correct, well done! \n+1000 points");
    }    
        
    
    }
    
}
