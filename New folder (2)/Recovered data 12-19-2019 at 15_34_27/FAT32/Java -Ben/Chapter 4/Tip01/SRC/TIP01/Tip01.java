
package tip01;

public class Tip01 {
    public static void main(String[] args) {
        //Find everyone's indivudlal total after tax(5%) and tip(15%)
        
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */
        
        //tax = 5% ; tip = 15%
        
        double person1 = 10;
        double person2 = 12;
        double person3 = 9;
        double person4 = 8;
        double person5 = 7;
        double person6 = 15;
        double person7 = 11;
        double person8 = 30;
        
        double total1 = person1*1.2;
        double total2 = person2*1.2;
        double total3 = person3*1.2;
        double total4 = person4*1.2;
        double total5 = person5*1.2;
        double total6 = person6*1.2;
        double total7 = person7*1.2;
        double total8 = person8*1.2;
        
        
        System.out.println("$" + total1);
        System.out.println("$" + total2);
        System.out.println("$" + total3);
        System.out.println("$" + total4);
        System.out.println("$" + total5);
        System.out.println("$" + total6);
        System.out.println("$" + total7);
        System.out.println("$" + total8);
        
        
        
    }    
}
