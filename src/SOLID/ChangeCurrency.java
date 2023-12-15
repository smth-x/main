package SOLID;

class ChangeCurrency{
    private static double oneDollarToEuro = 0.92;
    private static double oneEuroToDollar = 1.09;
    public void USDtoEUR(User.UserBankAccount bankAccount){
        bankAccount.balance*=oneDollarToEuro;
        bankAccount.cash*=oneDollarToEuro;
        bankAccount.currentCurrency = "EUR";
    }
    public void EURtoUSD(User.UserBankAccount bankAccount){
        bankAccount.balance*=oneEuroToDollar;
        bankAccount.cash*=oneEuroToDollar;
        bankAccount.currentCurrency = "USD";
    }
}