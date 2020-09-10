package privatevariables;


public class PrivateVariables {

    
    public static void main(String[] args) {
        Bank_Account my_Bank = new Bank_Account();
        
        int acc_Num = 123;
        double acc_Balance = 502.29;
        String acc_Name = "Bob Tabor";
        
        my_Bank.setAccount_Num(acc_Num);
        my_Bank.setAccount_Balance(acc_Balance);
        my_Bank.setAccount_Name(acc_Name);
        
        my_Bank.make_Withdraw(6.29);
        
        
        System.out.println(my_Bank.getAccount_Balance());
        
        
        
    }
    
}
