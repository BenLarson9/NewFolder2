package arcadegame;

import java.util.Scanner;


class Terminal {
    private int credits = 5;
    
    Terminal(){}
    public void tCredits(int money) { 
        this.credits = money * 2;
        System.out.println("Each card now has " + credits + " credits.");
        Game game = new Game();
        game.doGames(credits);
    }
    
    
    
    
    
    
//getters 
    public int getCredits() {
        return credits;
    }
    
//setters
    public void setCredits(int credits) {
        this.credits = credits;
    }

    void buyToys(int tickeB, int tickeb) {
        int bear = 3;
        int shirt = 2;
        int watch = 1;
        int a = 0;
        while(tickeB > 0 || tickeb > 0 ){
            Scanner sc = new Scanner(System.in);
            
            while(a == 0 ){
                if(tickeb < 50 && tickeB < 50){System.out.println("you dont have enought to by anything");}
                else{System.out.println("which card do you want to buy with, -1 to quit");
            int b = sc.nextInt();
            if(b == 17401){
                System.out.println("Do you want to 1: buy a bear for 50 tickects\n2: Buy a shirt for 100 tickects\nOr 3: buy a watch for 200 tickects?\n ");
                b = sc.nextInt();
                switch(b){
                    case 1: if(tickeB > 50 && bear > 0){bear--;System.out.println("One bear bought\nThere are "+bear+" bear(s) left"); tickeB -= 50;}else{System.out.println("not enough");} break;
                    case 2: if(tickeB > 100 && shirt > 0){shirt--;System.out.println("One shirt bought\nThere are "+shirt+" shirt(s) left"); tickeB -= 100;}else{System.out.println("not enough");} break;
                    case 3: if(tickeB > 200 && watch > 0){ watch--; System.out.println("One watch bought\nNo watches remaining"); tickeB -= 200;} else{System.out.println("not enough");}break;
                    default: break;
                }
            }
            if(b == 17402 ){
                System.out.println("Do you want to 1: buy a bear for 50 tickects\n2: Buy a shirt for 100 tickects\nOr 3: buy a watch for 200 tickects?\n ");
                b = sc.nextInt();
                switch(b){
                    case 1: if(tickeb > 50 && bear > 0){bear--;System.out.println("One bear bought\nThere are "+bear+" bear(s) left"); tickeb -= 50;}else{System.out.println("not enough");} break;
                    case 2: if(tickeb > 100 && shirt > 0){shirt--;System.out.println("One shirt bought\nThere are "+shirt+" shirt(s) left"); tickeb -= 100;}else{System.out.println("not enough");} break;
                    case 3: if(tickeb > 200 && watch > 0){watch--;System.out.println("One watch bought\nNo watches remaining"); tickeb -= 200;}else{System.out.println("not enough");} break;
                    default: break;
                }
            }}
                
           
        
    }
    }
    System.out.println("thats all i can handle");
    
    }

}
