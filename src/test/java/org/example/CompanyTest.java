package org.example;

import org.example.taxes.TaxIncome;
import org.example.taxes.TaxSystem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.management.ConstructorParameters;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {
    TaxSystem taxSystem = new TaxIncome();
    Company com = new Company("Fox", taxSystem);

    @Test
    void testShiftMoney() {
        com.shiftMoney(25);
        assertEquals(25, com.debit);
    }

    @Test
    void testPayTaxes() {
        int sum = taxSystem.calcTaxFor(1000, 300);
        Assertions.assertEquals(0, com.credit);
    }

    @Test
    void testApplyDeals() {
        com.applyDeals((new Deal[] {
                new Sale("Лимоны", 1000)}));
        Assertions.assertEquals(0, com.credit);
    }
}