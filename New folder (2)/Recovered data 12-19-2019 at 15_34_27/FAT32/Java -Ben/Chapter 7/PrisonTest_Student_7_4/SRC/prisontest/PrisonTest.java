package prisontest;

public class PrisonTest {
    public static void main(String[] args){
        Prisoner p01 = new Prisoner("Bubba", 2.08, 4);
        Prisoner p02 = new Prisoner();
        p02.outPrint("Twitch", true, 3, 5.08);
        System.out.println("");
        
    }
}
