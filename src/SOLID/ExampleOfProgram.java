package SOLID;

public class ExampleOfProgram {
    User user = new User("Alex","Surm","AlexSurm@gmail.com");
    User.UserBankAccount firstBankAccount = new User.UserBankAccount(500,2000,"USD","regular",user);
    User.UserBankAccount secondBankAccount = new User.UserBankAccount(1500,50250,"EUR","premium",user);
    Transaction transaction = new Transaction();
    ChangeCurrency changeCurrency = new ChangeCurrency();
    public void example(){
        //work with the first acc:
        showBalanceOnFirstAcc();
        transaction.withdraw(firstBankAccount,500);
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
