
package citystatezipaddressproject;
import java.util.Scanner;

public class CityStateZipAddressProject {

    
    public static void main(String[] args) {
        
     // name, street, city, phone number, state zip code
     Scanner myScanner = new Scanner(System.in);
     
     String value = "Your Name";
     
       System.out.println("Enter your " + value );
       String username = myScanner.nextLine();
       System.out.println(value + " is: " + username);
       
    value = "Your Street";
     
       System.out.println("Enter your " + value );
       String address = myScanner.nextLine();
       System.out.println(value + " is: " + address);
       
    value = "Your City";
     
       System.out.println("Enter your " + value );
       String city = myScanner.nextLine();
       System.out.println(value + " is: " + city);
       
    value = "Your State";
     
       System.out.println("Enter your " + value );
       String state = myScanner.nextLine();
       System.out.println(value + " is: " + state);
       
    value = "Your Zip Code";
     
       System.out.println("Enter your " + value );
       String zipCode = myScanner.nextLine();
       System.out.println(value + " is: " + zipCode);
       
    value = "Your Phone Number";
     
       System.out.println("Enter your " + value );
       String phoneNumber = myScanner.nextLine();
       System.out.println(value + " is: " + phoneNumber);
        
        System.out.println(" ");
        System.out.println("Your Whole Address is: ");
        System.out.println(username);
        System.out.println(address);
        System.out.println(city + " " + state + ", " + zipCode);
        System.out.println(" ");
        System.out.println("Phone Number:");
        System.out.println(phoneNumber);
        
    }
    
}

    
    

