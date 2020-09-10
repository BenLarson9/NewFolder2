
package phraseomaticbl;


public class PhraseOMaticBL {

    
    public static void main(String[] args) {
        
        PrintMe myPrint = new PrintMe();
        myPrint.GetHeader();
        
        MyPhrase newPhrase = new MyPhrase();
        String phrase = newPhrase.GetPhrase();
        
        myPrint.GetFooter(phrase);
        
        
        
        
        
           
    }
    
}
