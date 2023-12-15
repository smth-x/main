package SOLID;

public interface UserType {
    double depositMoneyWithTax(int howMuchMoney);
    double withdrawMoneyWithTax(int howMuchMoney);
}
class RegularUser implements UserType{
    double percentOnDeposit = 0.02; //2% на то, что юзер кладёт деньги
    double percentOnWithdrawal = 0.01; //1% на то, что юзер снимает деньги
    @Override
    public double depositMoneyWithTax(int howMuchMoney){
        return howMuchMoney-(howMuchMoney* percentOnDeposit);
    }
    @Override
    public double withdrawMoneyWithTax(int howMuchMoney) {
        return howMuchMoney-(howMuchMoney* percentOnWithdrawal);
    }
}
class PremiumUser implements UserType{
    double percentOnDeposit = 0.01; //1% на то, что юзер кладёт деньги
    @Override
    public double depositMoneyWithTax(int howMuchMoney){
        return howMuchMoney-(howMuchMoney* percentOnDeposit);
    }
    @Override
    public double withdrawMoneyWithTax(int howMuchMoney) {
        return howMuchMoney; //Премиум-юзеры не платят налог на снятие денег, поэтому значение возвращается без изменений
    }
}
