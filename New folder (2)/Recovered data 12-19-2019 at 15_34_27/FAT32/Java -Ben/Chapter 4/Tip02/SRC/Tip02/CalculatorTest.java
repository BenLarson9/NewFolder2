
package Tip02;

public class CalculatorTest {
    public static void main(String[] args) { 
        //Instantiate a Calculator object
        Calculator calc = new Calculator();
       
       
        //Access the Calculator object's fields and methods
        //to find the total for each member of the birthday party
        calc.originalPrice=10;
        calc.findTotal();
        calc.originalPrice=12;
        calc.findTotal();
        calc.originalPrice=9;
        calc.findTotal();
        calc.originalPrice=8;
        calc.findTotal();
        calc.originalPrice=7;
        calc.findTotal();
        calc.originalPrice=15;
        calc.findTotal();
        calc.originalPrice=11;
        calc.findTotal();
        calc.originalPrice=30;
        calc.findTotal();
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15 (Alex)
        Person 7: $11
        Person 8: $30
        */
        
        
        //4.1a 32:41
    }
}
