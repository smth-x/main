package SOLID;

import java.util.Scanner;

public class StartProgram {
    User user;
    User.UserBankAccount firstBankAccount;
    User.UserBankAccount secondBankAccount;
    Transaction transaction;
    ChangeCurrency changeCurrency;
    public static void main(String[] args) {

    }
    public void exampleOfProgram(){
        user = new User("Alex","Surm","AlexSurm@gmail.com");
        firstBankAccount = new User.UserBankAccount(500,2000,"USD","regular",user);
        secondBankAccount = new User.UserBankAccount(1500,50250,"EUR","premium",user);
        transaction = new Transaction();
        changeCurrency = new ChangeCurrency();


        //work with the first acc:
        showBalanceOnFirstAcc();
        changeCurrency.USDtoEUR(firstBankAccount);
        showBalanceOnFirstAcc();
        changeCurrency.EURtoUSD(firstBankAccount);
        showBalanceOnFirstAcc();

        transaction.withdraw(firstBankAccount,200);
        showBalanceOnFirstAcc();
    }
    public void showBalanceOnFirstAcc(){
        System.out.println("");
        System.out.println(firstBankAccount.cash);
        System.out.println(firstBankAccount.balance);
        System.out.println(firstBankAccount.currentCurrency);
        System.out.println("");
    }
    public void showBalanceOnSecondAcc(){
        System.out.println("");
        System.out.println(secondBankAccount.cash);
        System.out.println(secondBankAccount.balance);
        System.out.println(secondBankAccount.currentCurrency);
        System.out.println("");
    }
}