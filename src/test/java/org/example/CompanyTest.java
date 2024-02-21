package org.example;

import org.example.taxes.TaxIncome;
import org.example.taxes.TaxSystem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    @Test
    void shiftMoney() {
        TaxSystem taxSystem = new TaxIncome();
        Company com = new Company("Fox", TaxSystem taxSystem);
        int sum = com.shiftMoney(25);
        Assertions.assertEquals(25, sum);
    }

    @Test
    void payTaxes() {
    }

    @Test
    void applyDeals() {
    }
}