package soccer.game.pkg2;

import java.util.ArrayList;


public class Game {

    private static final ArrayList<Game> gameLog = new ArrayList<>();
    private Team homeTeam;
    private Team awayTeam;
    private int homeTeamScore;
    private int awayTeamScore;
    private int temperature;
    private int gameNumber;

    public void printStats(){
        System.out.println("Game #: "+gameNumber);
        System.out.println("Temperature: "+ temperature);
        System.out.println("Away Team: "+awayTeam.getName()+awayTeamScore);
        System.out.println("Home Team: "+homeTeam.getName()+homeTeamScore);
        System.out.println("");
    }
    public static void printAllStats() {
        for(Game game: gameLog){
            game.printStats();
        }
        
    }

    static void printHottestTemp() {
        int hottestTemp = 0;
        for(Game game: gameLog){
            if(game.temperature > hottestTemp){
                hottestTemp = game.temperature;
            }
        }
        System.out.println("Hottest Temperature was: "+hottestTemp);
    }

    static void printAverageTemp() {
        double totalDegrees = 0;
        for(Game game: gameLog){
            totalDegrees += game.temperature;
        }
        if(gameLog.isEmpty()){
            System.out.println("No Games Played this Season");
        }
        else{
            System.out.println("Average Temp: "+totalDegrees/gameLog.size());
        }
    }

    Game(Team homeT, Team awayT, int temp) {
        this.homeTeam = homeT;
        this.awayTeam = awayT;
        this.temperature = temp;
        
        gameLog.add(this);
        gameNumber = gameLog.size();
        
    }

    void play() {
       homeTeamScore = (int)(Math.random()*(3+temperature/16.0)); 
       awayTeamScore = (int)(Math.random()*(3+temperature/16.0)); 
       
       homeTeam.addPointsScored(homeTeamScore);
       homeTeam.addPointsAllowed(awayTeamScore);
       awayTeam.addPointsScored(awayTeamScore);
       awayTeam.addPointsAllowed(homeTeamScore);
       
       if(homeTeamScore > awayTeamScore){
           homeTeam.addWin();
           awayTeam.addLosses();
       }
       else if(homeTeamScore < awayTeamScore){
           homeTeam.addLosses();
           awayTeam.addWin();
       }       
       else{
           homeTeam.addTies();
           awayTeam.addTies();
       }
    }
    
}
