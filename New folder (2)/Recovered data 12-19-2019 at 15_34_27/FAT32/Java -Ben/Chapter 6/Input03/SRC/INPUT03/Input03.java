package input03;

import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner sc = new Scanner(System.in);
        
        //Find and print the sum of three integers entered by the user
        System.out.println("Please enter a number.");
        String a = sc.nextLine();
        System.out.println("Please enter another number.");
        String b = sc.nextLine();
        System.out.println("Please enter another number again.");
        String c = sc.nextLine();
        int d = Integer.parseInt(a);
        int e = Integer.parseInt(b);
        int f = Integer.parseInt(c);
        int g = d + e + f;
        System.out.println("Thanks! \n\nIf you added those together "
                + "you would get " + g );
        
        
               
        //Remember to close the Scanner 
        sc.close();
    }
}
