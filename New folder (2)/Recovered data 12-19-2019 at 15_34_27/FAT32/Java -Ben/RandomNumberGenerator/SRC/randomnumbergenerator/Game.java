
package randomnumbergenerator;
import java.util.Scanner;

public class Game {

    static void getRand() {
        
int max = 100;
int min = 0;
int range = max - min;
int rand = (int)(Math.random() * range) + min;

PrintMe print = new PrintMe();
print.getHeader();

Scanner sc = new Scanner(System.in); 
String name = sc.nextLine();
   print.getMiddle();
           
int x = Integer.parseInt(sc.nextLine());
int counter = 0;

   while (x != rand){ 
      if (x < rand) {System.out.println("Thats to low"); }
      if (x > rand) {System.out.println("Its a little high"); }
      x = Integer.parseInt(sc.nextLine());
      counter++;
   }
   counter++;     
   
        System.out.println("\nYou are correct " + name + "\n"); 
        System.out.println("It took you " + counter + " tries,");
        
        if (counter <= 3){print.getFooter1();}
        if (counter == 4){print.getFooter2();}
        if (counter == 5){print.getFooter2();}
        if (counter == 6){print.getFooter2();}
        if (counter == 7){print.getFooter3();}
        if (counter == 8){print.getFooter3();}
        if (counter >= 9){print.getFooter4();}
    
    }


}

    

