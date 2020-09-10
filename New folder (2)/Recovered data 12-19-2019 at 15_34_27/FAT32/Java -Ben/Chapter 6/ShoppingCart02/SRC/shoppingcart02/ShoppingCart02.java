
package shoppingcart02;

public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase 2 "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        
        System.out.println(message);
        
        //now add numbers
        double itemPrice = 12.00, salesTax = .10;
        int itemQuantity = 2;
        double totalPrice = ((itemPrice * itemQuantity));
     
        totalPrice = (totalPrice + (totalPrice * salesTax));
    
        System.out.println("Total Cost with Tax is: $" + totalPrice);
        
        
        // Declare and assign a calculated totalPrice
        
        
        // Modify message to include quantity 
        
       
        
        // Print another message with the total cost
        
    }    
}
