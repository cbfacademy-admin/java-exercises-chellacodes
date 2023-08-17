package com.cbfacademy.accounts;

public class CurrentAccount extends Account {

    private double overdraftLimit;

   // constructor 
   
   public CurrentAccount(double balance, int accountNumber, double overdraftLimit){
        super(balance, accountNumber); 
        this.overdraftLimit = overdraftLimit; 

    }

   public int getOverdraftAmount() {
        return 0;
    }

@Override 
public void withdraw(double ammountToWithdraw) {
    if (ammountToWithdraw <= getBalance()) {
    withdraw(ammountToWithdraw);  }

    else if (ammountToWithdraw <= (getBalance() + overdraftLimit))
    double overdraft = getBalance() - ammountToWithdraw; 
    withdraw(ammountToWithdraw);

}


    
}
