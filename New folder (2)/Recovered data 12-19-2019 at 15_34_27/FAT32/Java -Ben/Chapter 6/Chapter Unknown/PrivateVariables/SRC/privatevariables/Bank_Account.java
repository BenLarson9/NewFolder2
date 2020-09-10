package privatevariables;


class Bank_Account {
    private int account_Num;
    private double account_Balance;
    private String account_Name;

    public Bank_Account(int account_Num, double account_Balance, String account_Name) {
        this.account_Num = account_Num;
        this.account_Balance = account_Balance;
        this.account_Name = account_Name;
    }

    Bank_Account() {}

    public int getAccount_Num() {
        return account_Num;
    }

    public double getAccount_Balance() {
        return account_Balance;
    }

    public String getAccount_Name() {
        return account_Name;
    }

    public void setAccount_Num(int account_Num) {
        this.account_Num = account_Num;
    }

    public void setAccount_Balance(double account_Balance) {
        this.account_Balance = account_Balance;
    }

    public void setAccount_Name(String account_Name) {
        this.account_Name = account_Name;
    }

    void make_Withdraw(double d) {
        account_Balance = account_Balance - d;
        
    }
    
    
}
