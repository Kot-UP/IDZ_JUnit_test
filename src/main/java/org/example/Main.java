package org.example;

import org.example.taxes.TaxConsumption;
import org.example.taxes.TaxIncome;
import org.example.taxes.TaxSystem;

public class Main {

    public static void main(String[] args) {

        TaxSystem taxSystem = new TaxIncome();

        Company company = new Company("Fox", taxSystem);

        company.shiftMoney(100);
        company.shiftMoney(2000);
        company.shiftMoney(-200);

        company.setTaxSystem(new TaxConsumption());

        company.payTaxes();

        company.applyDeals(new Deal[]{
                new Sale("Лимоны", 1000),
                new Expenditure("Груши", 300)
        });
    }
}