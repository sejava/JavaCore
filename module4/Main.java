package module4;

import static module4.Currency.EUR;
import static module4.Currency.USD;

/**
 * Created by pan on 23.12.16.
 */
public class Main {
    public static void main(String[] args) {
        Bank usBank = new USBank(1,"USA",50,12500,6,7000000);
        usBank.setCurrency(USD);
        Bank euBank = new EUBank(2,"Europa",100,5000,3,15000000);
        euBank.setCurrency(EUR);
        Bank chinaBank = new ChinaBank(3,"China",4000,2400,2,94300000);
        chinaBank.setCurrency(EUR);

        User user = new User(1,"Ivan",0,1000,"USA",2000,usBank);
        User user1 = new User(3,"user1",0, 2000,"Ukraine",400,usBank);
        User user2 = new User(2,"Hubert",0,3000,"Budowlanka",2000,euBank);
        User user3 = new User(4,"Alisa",0,4000,"University",400,euBank);
        User user4 = new User(5,"Ania",0,5000,"University",2000,chinaBank);
        User user5 = new User(6,"Dima",0,6000,"University",400,chinaBank);

        BankSystem bankSystem = new BankSystemImpl();

        bankSystem.paySalary(user);
        bankSystem.paySalary(user1);
        bankSystem.paySalary(user2);
        bankSystem.paySalary(user3);
        bankSystem.paySalary(user4);
        bankSystem.paySalary(user5);

        bankSystem.transferMoney(user1,user3,200);
        bankSystem.transferMoney(user,user4,1000);
        bankSystem.transferMoney(user2,user5,200);

        bankSystem.fundUser(user,1000);
        bankSystem.fundUser(user1,1000);
        bankSystem.fundUser(user2,1000);
        bankSystem.fundUser(user3,1000);
        bankSystem.fundUser(user4,1000);
        bankSystem.fundUser(user5,1000);

        bankSystem.withdrawOfUser(user,100);
        bankSystem.withdrawOfUser(user1,100);
        bankSystem.withdrawOfUser(user2,100);
        bankSystem.withdrawOfUser(user3,100);
        bankSystem.withdrawOfUser(user4,100);
        bankSystem.withdrawOfUser(user5,109);

        System.out.println(user);
        System.out.println();
        System.out.println(user1);
        System.out.println();
        System.out.println(user2);
        System.out.println();
        System.out.println(user3);
        System.out.println();
        System.out.println(user4);
        System.out.println();
        System.out.println(user5);
        System.out.println();

        //System.out.println(user1);
       // bankSystem.fundUser(user,4200);
    }
}
