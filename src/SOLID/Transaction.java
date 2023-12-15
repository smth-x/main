package SOLID;

public class Transaction {

    UserType regularUser = new RegularUser();
    UserType premiumUser = new PremiumUser();

    public void withdraw(User.UserBankAccount bankAccount, int howMuchMoney) {
        if (bankAccount.balance>=howMuchMoney) {
            bankAccount.balance -= howMuchMoney;
            switch (bankAccount.typeOfAccout) {
                case "regular":
                    System.out.println("success");
                    bankAccount.cash += regularUser.withdrawMoneyWithTax(howMuchMoney);
                    break;
                case "premium":
                    System.out.println("success");
                    bankAccount.cash += premiumUser.withdrawMoneyWithTax(howMuchMoney);
                    break;
                default:
                    System.out.println("unknown typeOfAccount");
            }
        } else {
            System.out.println("not enough money on balance");
        }
    }

    public void deposit(User.UserBankAccount bankAccount, int howMuchMoney) {
        if (bankAccount.cash>=howMuchMoney) {
            bankAccount.cash -= howMuchMoney;
            switch (bankAccount.typeOfAccout) {
                case "regular":
                    System.out.println("success");
                    bankAccount.balance += regularUser.depositMoneyWithTax(howMuchMoney);
                    break;
                case "premium":
                    System.out.println("success");
                    bankAccount.balance += premiumUser.depositMoneyWithTax(howMuchMoney);
                    break;
                default:
                    System.out.println("unknown typeOfAccount");
            }
        } else {
            System.out.println("not enough cash");
        }
    }
}
