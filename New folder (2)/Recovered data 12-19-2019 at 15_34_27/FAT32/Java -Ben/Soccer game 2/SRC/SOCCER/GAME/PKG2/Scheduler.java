package soccer.game.pkg2;

import java.util.ArrayList;


public class Scheduler {

    private Team[] teamsArray;
    private int[] previous3Attemps = {100, 100, 100};
    private int tempIndex = 0;
    public static final int Minimum_Temp = 32;
    
    public Scheduler(Team[] allTeams) {
        this.teamsArray = allTeams;
    }

    public void scheduleGames(int temp) {
        if (temp > Minimum_Temp) {
            ArrayList <Integer> teamsRemaining = new ArrayList<>();
            for (int i = 0; i < teamsArray.length; i++){
                teamsRemaining.add(i);
            }
            while(teamsRemaining.size() > 1){
                int rannum = (int) (Math.random()*teamsRemaining.size());
                Team team1 = teamsArray[teamsRemaining.get(rannum)];
                teamsRemaining.remove(rannum);
                
                rannum = (int) (Math.random()*teamsRemaining.size());
                Team team2 = teamsArray[teamsRemaining.get(rannum)];
                teamsRemaining.remove(rannum);
                
                rannum = (int) (Math.random()*teamsRemaining.size());
                Team team3 = teamsArray[teamsRemaining.get(rannum)];
                teamsRemaining.remove(rannum);
                
                rannum = (int) (Math.random()*teamsRemaining.size());
                Team team4 = teamsArray[teamsRemaining.get(rannum)];
                teamsRemaining.remove(rannum);
                
                Game nextGame = new Game(team1, team2 , temp);
                nextGame.play();
            }
        }
        else{
            System.out.println("Too cold to play");
        }
        
        previous3Attemps[tempIndex] = temp;
        tempIndex = (tempIndex+1)%3;
        
    }

    boolean checkLastThreeTemps() {
       for(int i : previous3Attemps){
           if(i > Minimum_Temp){
               return true;
           }
       } 
       return false;
    }

    void printAllStats() {
        for(Team team: teamsArray){
            team.printStats();
            
        }
    }
    
}
