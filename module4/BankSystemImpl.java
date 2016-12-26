package module4;

/**
 * Created by pan on 23.12.16.
 */
public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
        Bank userBank = user.getBank();
        double comission = (double)userBank.getCommission(amount) / 100;

        if (userBank.getLimitOfWithdraw() >= amount + (amount * comission)){
            double newBalance = user.getBalance() - (amount + (amount * comission));
            user.setBalance(newBalance);
        }

    }

    @Override
    public void fundUser(User user, int amount) {
        if (user.getBalance() >= amount)
            System.out.println("OK");
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        Bank userBank = fromUser.getBank();
        double comission = (double) userBank.getCommission(amount) / 100;
        fromUser.setBalance(fromUser.getBalance() - amount - (amount * comission));
        toUser.setBalance(toUser.getBalance() + amount);
    }

    @Override
    public void paySalary(User user) {
        //user balance + salary - commision
        Bank userBank = user.getBank();
        double comission = (double) userBank.getCommission(user.getSalary()) / 100;
        user.setBalance(user.getBalance() + (user.getSalary() - (user.getBalance() * comission)));
    }
}
