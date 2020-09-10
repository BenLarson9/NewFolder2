package simpletest;


public class SimpleTest {

   
    public static void main(String[] args) {
        
        SimpleDotCom dot = new SimpleDotCom();
        
        int[] locations = {2,3,4};
        
        dot.setLocationCells(locations);
        
        String userGuess = "2";
        String result = dot.checkyourself(userGuess);
        String testResult = "Failed";
        
        if (result.equals("Hit")) {testResult = "Passed";}
        System.out.println(testResult);
        
        
        
        
    }

    
}
