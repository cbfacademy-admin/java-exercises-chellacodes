package com.cbfacademy.accounts;


public class SavingsAccount extends Account {
    
    private double interest;
    public SavingsAccount(double balance, int accountNumber, int interest){
        super(balance, accountNumber); 
        this.interest = interest;     
    }

    public void addInterest(){

    double amountOfInterest = getBalance() * interest; 
    deposit(amountOfInterest); 
    }

@Override
 public double getBalance(){ 
    return super.getBalance() + (interest * super.getBalance());
}}
    



