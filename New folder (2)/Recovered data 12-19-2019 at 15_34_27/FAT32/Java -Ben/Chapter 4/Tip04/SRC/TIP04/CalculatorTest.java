
package tip04;

public class CalculatorTest {
    public static void main(String[] args) {
        
        Calculator calc = new Calculator();
        
        double tableTotal = 0;
        //Name your friends
        tableTotal += calc.findTotal(10, "Bob Tabor");
        tableTotal += calc.findTotal(12, null);
        tableTotal += calc.findTotal(9,  null);
        tableTotal += calc.findTotal(8,  null);
        tableTotal += calc.findTotal(7,  null);
      //tableTotal += calc.findTotal(15, "Alex");
        tableTotal += calc.findTotal(11, null);
      //tableTotal += calc.findTotal(30, "Forgetful");

        System.out.println("The table total is: " + tableTotal);
        //Find and print the entire table's total, including tax and tip
      //4.1b 27:13 
    } 
}
