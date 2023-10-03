package com.cbfacademy.accounts;

public class Account{

    private double balance;

    private int accountNumber; 


public Account(double balance, int accountNumber){

  this.balance = balance; 
  this.accountNumber = accountNumber; 

}

// method for getting balance 

public double getBalance(){
    return balance; 
}
 
// method for getting account number 

public int getAccountNumber(){
       return accountNumber;
}

//
 

public void deposit(double amountToDeposit) {

    if (amountToDeposit > 0) {
    balance = amountToDeposit + balance;
    ;}
    else{System.out.println("Not able to deposite minus")};
  }


// this code is ensuring that you cannot withdraw more than the balance 

public void withdraw(double ammountToWithdraw) {

    if(ammountToWithdraw <= balance){
        balance = balance - ammountToWithdraw; 
    }
    else{System.out.println("Insuffient funds");}


    
}}





