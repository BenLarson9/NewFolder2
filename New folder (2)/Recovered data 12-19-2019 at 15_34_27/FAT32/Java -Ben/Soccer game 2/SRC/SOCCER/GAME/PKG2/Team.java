package soccer.game.pkg2;


public class Team {

    private String name;
    private int wins, losses, ties, pointsScored, pointsAllowed;
    
    
    Team(String name) {
        this.name = name;
        
    }
    public void printStats(){
        System.out.println(name);
        System.out.println("Wins: "+wins+", Losses: "+losses+", Ties: "+ties);
        System.out.println("Points Scored: "+pointsScored+", Points Allowed: "+pointsAllowed);
        System.out.println(" ");
        
    }
    //Ugly methods
    public void addWin(){
        wins++;
    }
    public void addLosses(){
        losses++;
    }
    public void addTies(){
        ties++;
    }
    public void addPointsScored(int p){
        this.pointsScored += p;
    }
    public void addPointsAllowed(int p){
        this.pointsAllowed += p;
    }
    
    //Getter
    public String getName() {
        return name;
    }
    
    
    
    
    
}
