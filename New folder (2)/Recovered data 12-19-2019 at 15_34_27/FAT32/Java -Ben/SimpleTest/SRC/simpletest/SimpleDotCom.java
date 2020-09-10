
package simpletest;


public class SimpleDotCom {

    int[] locationCells;
    int numOfHits;
    
    
    
    
    void setLocationCells(int[] locations) {
   locationCells = locations;
   
    }

    
    
    
    String checkyourself(String userGuess) {
        int guess = Integer.parseInt(userGuess);
        String result = "Miss";
        
        for (int cell : locationCells) {
            if (guess == cell) {result = "Hit"; numOfHits++; break;}
    }
            if (numOfHits == locationCells.length) { result = "Ship Sunk";}
            
        System.out.println(result);
        return result;
        }
            
        
     
    }
    
    
    
  

