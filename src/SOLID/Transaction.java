package SOLID;

public class Transaction {

    public void withdraw(User.UserBankAccount bankAccount, int howMuchMoney) {
        if (bankAccount.balance >= howMuchMoney) {
            UserType userType = getUserType(bankAccount);
            if (userType != null) {
                bankAccount.balance -= howMuchMoney;
                bankAccount.cash += userType.withdrawMoneyWithTax(howMuchMoney);
                System.out.println("success");
            } else {
                System.out.println("unknown typeOfAccount");
            }
        } else {
            System.out.println("not enough money on balance");
        }
    }

    public void deposit(User.UserBankAccount bankAccount, int howMuchMoney) {
        if (bankAccount.cash >= howMuchMoney) {
            UserType userType = getUserType(bankAccount);
            if (userType != null) {
                bankAccount.cash -= howMuchMoney;
                bankAccount.balance += userType.depositMoneyWithTax(howMuchMoney);
                System.out.println("success");
            } else {
                System.out.println("unknown typeOfAccount");
            }
        } else {
            System.out.println("not enough cash");
        }
    }

    private UserType getUserType(User.UserBankAccount bankAccount) {
        switch (bankAccount.typeOfAccout) {
            case "regular":
                return new RegularUser();
            case "premium":
                return new PremiumUser();
            default:
                return null;
        }
    }
}
