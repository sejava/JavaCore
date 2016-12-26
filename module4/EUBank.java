package module4;

import static module4.Currency.EUR;
import static module4.Currency.USD;

/**
 * Created by pan on 23.12.16.
 */
public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, int numberOfEmployees, double avrSalaryOfEmployees, long rating, long totalCapital) {
        super(id, bankCountry, numberOfEmployees, avrSalaryOfEmployees, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdraw() {
        //limit of withdrawal = 2000 if currency is USD and 2200 if currency is EUR
        int limit = 0;
        if (getCurrency() == USD) limit = 2000;
        else if(getCurrency() == EUR) limit = 2200;
        return limit;
    }

    @Override
    int getLimitOfFunding() {
        //limit of funding - 20000 if EUR and 10000 if USD
        int limit = 0;
        if (getCurrency() == USD) limit = 10000;
        else if(getCurrency() == EUR) limit = 20000;
        return limit;
    }

    @Override
    int getMonthlyRate() {
        //monthly rate - 0% with USD and 1% with EUR
        int rate = 0;
        if (getCurrency() == USD) rate = 0;
        else if(getCurrency() == EUR) rate = 1;
        return rate;
    }

    @Override
    int getCommission(int summ) {
        //commision - 5% if USD and up to 1000, 7% if USD and more than 1000
        //2% if EUR and up to 1000 and 4% if EUR and more than 1000
        int comission = 0;
        if (getCurrency() == USD){
            if (summ <= 1000) comission = 5;
            if (summ > 1000 ) comission = 7;
        }
        else if (getCurrency() == EUR) {
            if (summ <= 1000) comission = 2;
            if (summ > 1000) comission = 4;
        }
        return comission;
    }
}
