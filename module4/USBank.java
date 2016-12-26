package module4;

import static module4.Currency.EUR;
import static module4.Currency.USD;

public class USBank extends Bank {
    public USBank(long id, String bankCountry, int numberOfEmployees, double avrSalaryOfEmployees, long rating, long totalCapital) {
        super(id, bankCountry, numberOfEmployees, avrSalaryOfEmployees, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdraw() {
        //USBank: limit of withdrawal = 1000 if currency is USD and 1200 if currency is EUR
        int limit = 0;
        if (getCurrency() == USD){
            limit = 1000;
        }else if(getCurrency() == EUR){
            limit = 1200;
        }
        return limit;
    }

    @Override
    int getLimitOfFunding() {
        //limit of funding - 10000 if EUR and no limit if USD
        int limit = 0;
        if (getCurrency() == EUR) limit = 10000;
        else if (getCurrency() == USD) limit = Integer.MAX_VALUE;
        return limit;
    }

    @Override
    int getMonthlyRate() {
        //monthly rate - 1% with USD and 2% with EUR
        int rate = 0;
        if (getCurrency() == EUR) rate = 2;
        else if (getCurrency() == USD) rate = 1;
        return rate;
    }

    @Override
    int getCommission(int summ) {
        //commision - 5% if USD and up to 1000, 7% if USD and more than 1000
        int comission = 0;
        if (getCurrency() == USD && summ <= 1000) comission = 5;
        else if (getCurrency() == USD && summ > 1000 ) comission = 7;
        else if (getCurrency() == EUR && summ <= 1000 ) comission = 6;
        else if (getCurrency() == EUR && summ > 1000 ) comission = 8;
        return comission;
    }

    @Override
    public String toString() {
        return "USBank";
    }
}
