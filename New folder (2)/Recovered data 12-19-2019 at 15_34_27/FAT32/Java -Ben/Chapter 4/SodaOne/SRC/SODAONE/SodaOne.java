
package sodaone;


public class SodaOne {

    
    public static void main(String[] args) {
   
    int sodaNum = 99;    
        
      
    while (sodaNum>0){
        
        String word = " bottles";
        if (sodaNum<2){word =" bottle";}
        
        System.out.println(sodaNum + word + " of soda on the wall\n" + sodaNum +
        word + " of soda\nTake one down, pass it around");
        
        sodaNum--;
        
         if (sodaNum<2){word =" bottle";}
        
        System.out.println(sodaNum + word + " of soda on the wall\n");
        
    }
    
        
    
    
    
    }
    
}
