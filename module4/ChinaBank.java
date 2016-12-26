package module4;

import static module4.Currency.EUR;
import static module4.Currency.USD;

/**
 * Created by pan on 23.12.16.
 */
public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, int numberOfEmployees, double avrSalaryOfEmployees, long rating, long totalCapital) {
        super(id, bankCountry, numberOfEmployees, avrSalaryOfEmployees, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdraw() {
        //limit of withdrawal = 100 if currency is USD and 150 if currency is EUR
        int limit = 0;
        if (getCurrency() == USD) limit = 100;
        else if(getCurrency() == EUR) limit = 150;
        return limit;
    }

    @Override
    int getLimitOfFunding() {
        //limit of funding - 5000 if EUR and 10000 if USD
        int limit = 0;
        if (getCurrency() == USD) limit = 10000;
        else if(getCurrency() == EUR) limit = 5000;
        return limit;
    }

    @Override
    int getMonthlyRate() {
        //monthly rate - 1% with USD and 0% with EUR
        int rate = 0;
        if (getCurrency() == USD) rate = 1;
        else if(getCurrency() == EUR) rate = 0;
        return rate;
    }

    @Override
    int getCommission(int summ) {
        //commision - 3% if USD and up to 1000, 5% if USD and more than 1000
        //10% if EUR and up to 1000 and 11% if EUR and more than 1000
        if (getCurrency() == USD){
            if (summ <= 1000) return 3;
            if (summ > 1000) return 5;
        }
        else if (getCurrency() == EUR){
            if (summ <= 1000) return 10;
            if (summ > 1000 ) return 11;
        }
        return 0;
    }
}
