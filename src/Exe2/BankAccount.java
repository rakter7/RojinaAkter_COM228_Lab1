package Exe2;

import javax.swing.*;

public class BankAccount {
    private String accountNumber;
    private String accountName;
    private double balance;

    // default constructor
    public BankAccount(){

    }
    //Declare a constructor with three parameter
    public BankAccount(String accountNumber, String accountName, double balance){
        this.accountNumber = accountNumber;
        this.accountName = accountName;

        //check the initial balance is greater than 0.0
        if(balance>0){
            this.balance = balance;
        }
    }
    //Method that deposits (adds) only a valid amount to the balance
    public void deposit(double depositAmount){
        if(depositAmount>0.0){
            balance = balance + depositAmount;
            //balance += depositAmount;
        }
        else{
            String message="Please enter a valid amount";
            JOptionPane.showMessageDialog(null, message);
        }
    }
    //Method that withdraw (deducts) only a valid amount to the balance
    public void withdraw(double withdrawAmount){
        if(withdrawAmount>0.0){
            balance = balance - withdrawAmount;

        }
        else{
            String message="Please enter a valid amount";
            JOptionPane.showMessageDialog(null, message);
        }
    }
    public double getBalance(){
        return balance;
    }

    // setter
    public void setAccountName(String name)
    {
        this.accountName = accountName;
    }
    public void setAccountNumber(String accountName){this.accountNumber=accountNumber;}
    //getter
    public String getAccountName(){
        return accountName;
    }
    public String getAccountNumber(){return accountNumber;}

    //information display method
    public String getAccountInfo(){
        String accountInfo = ("Account number: "+accountNumber+"\nAccount Name: "+accountName+"\nBalance: "+String.format("%.2f", balance));
        return accountInfo;
    }

}
