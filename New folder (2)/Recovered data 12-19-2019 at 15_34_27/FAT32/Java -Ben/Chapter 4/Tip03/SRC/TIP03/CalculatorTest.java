
package tip03;

public class CalculatorTest {
    public static void main(String[] args) {
        
       Calculator calc = new Calculator();
       
       //Use the Calculator object and arguments supplied to findTotal()
       //to print the total for each person

        calc.findTotal(10.00, "Joe owes ");
        calc.findTotal(12.00, "John owes ");
        calc.findTotal(9.00, "Joseph owes ");
        calc.findTotal(8.00, "Jonothan owes ");
        calc.findTotal(7.00, "Alex owes ");
        calc.findTotal(15.00, "Josuke owes ");
        calc.findTotal(11.00, "Jotaro owes ");
        calc.findTotal(30.00, "DIO owes ");
       
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
    }    
}
