package prisontest;

public class Prisoner {
    //Fields 
    public String n;
    public double h;
    public int s;
    
    //Constructor
    public Prisoner(String n, double h, int s){
 	this.n = n;
 	this.h = h;
 	this.s = s;
    }
    public Prisoner(){}
    
    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    public String outPrint(String n, double h, int s, boolean b){
        if(b){think();}
        return n + h + s + b;
    }
    public String outPrint(double h, String n, boolean b, int s){
        if(b){think();}
        return n + h + s + b;
    }
    public String outPrint(String n, boolean b, int s, double h){
        if(b){think();}
        return n + h + s + b;
    }
    
    
   
    
    
}
