package accounttest;
import java.util.Scanner;
class Withdraw {
       
    double balance = 1190.56; 
    String name = "James";
    Scanner sc = new Scanner(System.in);
    
    void checkBalance() {
        CheckingAccount chkact = new CheckingAccount();
        chkact.getTheBalance(balance, name);
    }

    void JameSavingsBond() {
        System.out.println("Would you like to buy an interest plan?");
        System.out.println("0-11 months with 0.5% interest");
        System.out.println("12-23 months with 1% interest");
        System.out.println("24-35 months with 1.5% interest");
        System.out.println("36-47 months with 2% interest");
        System.out.println("48-60 months with 2.5% interest");
        System.out.println("Please enter how many months you would like below");
        double plan = sc.nextDouble();
 
        while (plan < 0 || plan > 60){
            System.out.println("Thats not a valid number of months");
            plan =  sc.nextDouble();}
        double months = plan;
        if(plan >= 0 && plan <= 11){ plan=plan*.005; balance=(balance*plan)+balance;}
        if(plan >= 12 && plan <= 23){ plan=plan*.01; balance=(balance*plan)+balance;}
        if(plan >= 24 && plan <= 35){ plan=plan*.015; balance=(balance*plan)+balance;}
        if(plan >= 36 && plan <= 47){ plan=plan*.02; balance=(balance*plan)+balance;}
        if(plan >= 48 && plan <= 60){ plan=plan*.025; balance=(balance*plan)+balance;}
    
        System.out.println("After "+months+" months, you have "+balance+" left." );
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    

