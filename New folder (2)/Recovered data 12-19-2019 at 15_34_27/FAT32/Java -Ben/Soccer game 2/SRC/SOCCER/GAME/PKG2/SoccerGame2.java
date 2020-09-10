package soccer.game.pkg2;

import javax.swing.JOptionPane;


public class SoccerGame2 {

    
    public static void main(String[] args) {
        Team team1 = new Team("Team 1");
        Team team2 = new Team("Team 2");
        Team team3 = new Team("Team 3");
        Team team4 = new Team("Team 4");
        
        Team [] allTeams = {team1,team2,team3,team4};
        
        Scheduler scheduler = new Scheduler(allTeams);
        
        boolean continueLoop = true;
        
        while(continueLoop){
            
            try{
                int temp = Integer.parseInt((String)JOptionPane.showInputDialog("Whats the temperature"));
                scheduler.scheduleGames(temp);
                
                continueLoop = scheduler.checkLastThreeTemps();
            }
            catch(NumberFormatException e){
                System.out.println("Bad Temp Value");
            }
        }
        System.out.println("Season is over\n********Results********");

        scheduler.printAllStats();
 
        Game.printAllStats();
        Game.printHottestTemp();
        Game.printAverageTemp();
        
        
        
    }
    
}
