package prisontest;
//this is also 7.3, don't be fooled by lies
public class Prisoner {
    //Fields 
    public String name;
    public double height;
    public int sentence;
    
    //Constructor
    public Prisoner(String n, double h, int s){
    this.name = n;
    this.height = h;
    this.sentence = s;
    
    }
    
    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }   
}
