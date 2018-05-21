package Exe2;

import javax.swing.*;
import java.util.Scanner;


public class BankAccountTest {
    public static void main(String[] args) {
        //first account
        BankAccount account2=new BankAccount ("1111","George Brown",500);
        String previousBalance = account2.getAccountInfo();
        JOptionPane.showMessageDialog(null, previousBalance);
        String option1 = JOptionPane.showInputDialog("Deposit (D) or Withdrawal (W): ");
        optionMethod(account2, option1);
        String message1 = account2.getAccountInfo();
        JOptionPane.showMessageDialog(null, message1);

        //second account
        String accountNumber = JOptionPane.showInputDialog("Enter account number: ");
        String accountName = JOptionPane.showInputDialog("Enter account name: ");
        String option = JOptionPane.showInputDialog("Deposit (D) or Withdrawal (W): ");
        BankAccount account1=new BankAccount (accountNumber,accountName,1000);
        optionMethod(account1, option);
        String message = account1.getAccountInfo();
        JOptionPane.showMessageDialog(null, message);

    }

    private static void optionMethod(BankAccount account, String option) {
        if(option.equals("D".toLowerCase())){
            String deposit = JOptionPane.showInputDialog("Amount to deposit: ");
            double depositAmount = Double.parseDouble(deposit);
            account.deposit(depositAmount);
            account.getAccountInfo();

        }
        if(option.equals("W".toLowerCase())){
            String withdraw = JOptionPane.showInputDialog("Amount to withdraw: ");
            double withdrawAmount = Double.parseDouble(withdraw);
            account.withdraw(withdrawAmount);
            account.getAccountInfo();

        }
    }
}
