package accounttest;
import java.util.Scanner;
public class CheckingAccount {
    
    Scanner sc = new Scanner(System.in);

    void getTheBalance(double balance, String name) { 
        double take;
        
        System.out.println("Enter the amount you want to withdraw, " + name +
        ". You currently have $" + balance);
        
        take = sc.nextDouble();
        if(take < 0){System.out.println("Thats a negative amount");}
        if(take > balance){System.out.println("Thats to big of an amount!");}
        if(take >=0 && take <= balance){
        balance = balance - take;
        System.out.println("You now have $" + balance + " left in your account "
        + name + ". Thank you!");
        }
    }
    
    
    
}
