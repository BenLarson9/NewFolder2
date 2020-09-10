
package randomnumbergenerator;
import java.util.Scanner;

public class PrintMe {

    static void getHeader() {
        System.out.println("        Guess the Number\n1-3 tries = Lucky"
        +"\n4-6 tries = genuis\n7-8 tries = Unlucky\n9+  tries = Special Home time!"
        +"\n\nPlease enter your name to continue");
    }
    
    void getMiddle() {
        System.out.println("\nNow enter a guess");
    }
    
    void getFooter1() {System.out.println("\bYou just got lucky");}

    void getFooter2() {System.out.println("\bWell done, your a genius!");}

    void getFooter3() {System.out.println("\bYou were destined to fail from the beginning");}
        
    void getFooter4() {System.out.println("\bHere comes the short bus!");}
        

    
    
}
