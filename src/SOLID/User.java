package SOLID;

public class User {
    String name;
    String surname;
    String email;
    User(String name, String surname, String email){
        if (name!=null && surname!=null && email!=null){
            this.name = name;
            this.surname = surname;
            this.email = email;
        } else {
            System.exit(13);
        }
    }
    static class UserBankAccount {
        double cash;
        double balance;
        String currentCurrency;
        String typeOfAccout;
        User user;

        public UserBankAccount(double cash, double balance, String currentCurrency, String typeOfAccount, User user) {
            this.cash = cash;
            this.balance = balance;
            this.currentCurrency = currentCurrency;
            this.typeOfAccout = typeOfAccount.toLowerCase();
            this.user = user;
        }
    }
}