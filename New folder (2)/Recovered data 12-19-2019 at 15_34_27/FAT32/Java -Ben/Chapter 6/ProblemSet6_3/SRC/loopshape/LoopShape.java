package loopshape;

import java.util.Scanner;

public class LoopShape {
    
    static void createRectangle(int width, int height){
        //Draw a Rectangle
        //Getting info
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Rectangle createtinator!\nPlease enter the height");
        
        height = sc.nextInt();
        while(height < 1){System.out.println("Please enter a height greater than 0"); height = sc.nextInt();}
        System.out.println("Please enter the width");
        
        width = sc.nextInt();
        while(width < 1){System.out.println("Please enter a width greater than 0"); width = sc.nextInt();}
       
        String getRekt = "#";
        int i;
        String sp = " ";
        
        //using info
       
        for (i = width - 1; i >= 1; i--){
        getRekt = getRekt + "#";
        }
     
        if (width > 1){getRekt = getRekt + "\n#";}
        
        for (int h = height - 2; h >= 1; h--){
            for (i = width - 2; i >= 1; i--){
            getRekt = getRekt + sp;
            }
            getRekt = getRekt + "#" + "\n#";
        }
        for (i = width - 1; i >= 1; i--){
        getRekt = getRekt + "#";
        }
     
        getRekt = getRekt + "\n";
        System.out.println(getRekt);
    }
    
    
    static void createTriangle(int leg){
        //Draw an Isosceles Right Triangle
        //get info
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Triangle createtinator!\nPlease enter the leg length");
        
        leg = sc.nextInt();
        while(leg < 1){System.out.println("Please enter a leg length greater than 0"); leg = sc.nextInt();}
       
        String triforce = "#\n";
        int i = 0;
        leg = leg;
        
        //use info
        
        for( i = 2; i < leg; i++ ){
            triforce = triforce + "#";
            for( int j = 2; j < i; j++ ){
                triforce = triforce + " ";
                }
            triforce = triforce + "#\n";
        }
        if( leg > 1){
        for( i = leg; i >= 1; i--){
            triforce = triforce + "#";
        }}
        
        System.out.println(triforce);
        
        
        
        
    }
}
