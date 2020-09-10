package prisontest;

public class PrisonTest {
    public static void main(String[] args){
        Cell cellA1 = new Cell("A1", false, 1234);
        Cell cellB1 = new Cell("B1", false, 1234);
        Cell cellC1 = new Cell("C1", false, 1234);
        Cell cellD1 = new Cell("D1", false, 1234);
        
        Prisoner bubba = new Prisoner("Bubba", 2.08, 4, cellA1);
        Prisoner twitch = new Prisoner("Twitch", 3.01, 4, cellB1);
        Prisoner joe = new Prisoner("Joe", 2.52, 4, cellC1);
        Prisoner Jogn = new Prisoner("Jogn", 2.08, 4, cellD1);

        bubba.display();
        twitch.display();
        joe.display();
        Jogn.display();
        
        System.out.println(Prisoner.prisonerCount());
        
    }
}
