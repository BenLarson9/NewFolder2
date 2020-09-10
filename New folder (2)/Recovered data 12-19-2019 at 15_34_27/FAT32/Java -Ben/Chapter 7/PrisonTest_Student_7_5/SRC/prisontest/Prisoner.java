package prisontest;

public class Prisoner {
    //Fields 
    private String name;
    private double height;
    private int sentence;
    private String cellName;
   
    
    //Constructor
    public Prisoner(String name, double height, int sentence, String cellName){
 	this.name = name;
 	this.height = height;
 	this.sentence = sentence;
        this.cellName = cellName;
        
        
    }
    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    } 
    public void display(boolean b){
        System.out.println("Name: " +name);
        System.out.println("Height: " +height);
        System.out.println("Sentence: " +sentence);
        System.out.println("Cell: " +cellName);
    }
  
    public String getName() {
        return name;
    }
    public double getHeight() {
        return height;
    }
    public int getSentence() {
        return sentence;
    }
    public String getCellName(){
        return cellName;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setSentence(int sentence) {
        this.sentence = sentence;
    }
    public void setCellName(String cellName){
        this.cellName = cellName;
    }
    
}

