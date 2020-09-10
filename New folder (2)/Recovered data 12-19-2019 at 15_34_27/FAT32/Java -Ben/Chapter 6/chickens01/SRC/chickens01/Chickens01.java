package chickens01;


public class Chickens01 {

   
    public static void main(String[] args) {
        
        int totalEggs = 0;
        int chickenCount = 3;
        int eggsPerChicken = 5;
        
        //Monday
        
        String dayOfWeek = "Monday ";
        String labelOne = "Farmer Brown's chicken number ";
        String labelTwo = " Farmer Brown's egg number " ;
        String frontEndLabel = "On ";
        
        totalEggs = chickenCount * eggsPerChicken;
        
        System.out.println(frontEndLabel + dayOfWeek + labelOne
                + chickenCount + labelTwo + totalEggs);
        
        //Tuesday
        
        dayOfWeek = "Tuesday ";
        chickenCount++;
        
        
        totalEggs = chickenCount * eggsPerChicken;
        
        System.out.println(frontEndLabel + dayOfWeek + labelOne
                + chickenCount + labelTwo + totalEggs);
        
        
        //Wednesday
        dayOfWeek = "Wednesday ";
        chickenCount = chickenCount/2;
        
        totalEggs = chickenCount * eggsPerChicken;
        
        System.out.println(frontEndLabel + dayOfWeek + labelOne
                + chickenCount + labelTwo + totalEggs);
        

        
        
        
        
        /*
        New week with 4 chickens pumping out 8 eggs a day per chicken
        */
        System.out.println( );
        
        
        
        totalEggs = 0;
        chickenCount = 8;
        eggsPerChicken = 4;
        
        //Monday
        dayOfWeek = "Monday ";
        
        totalEggs = chickenCount * eggsPerChicken;
        
        System.out.println(frontEndLabel + dayOfWeek + labelOne
                + chickenCount + labelTwo + totalEggs);
        
        //Tuesday
        
        dayOfWeek = "Tuesday ";
        chickenCount++;
        
        
        totalEggs = chickenCount * eggsPerChicken;
        
        System.out.println(frontEndLabel + dayOfWeek + labelOne
                + chickenCount + labelTwo + totalEggs);
        
        
        //Wednesday
        dayOfWeek = "Wednesday ";
        chickenCount = chickenCount/2;
        
        totalEggs = chickenCount * eggsPerChicken;
        
        System.out.println(frontEndLabel + dayOfWeek + labelOne
                + chickenCount + labelTwo + totalEggs);
    
    }
    
}
