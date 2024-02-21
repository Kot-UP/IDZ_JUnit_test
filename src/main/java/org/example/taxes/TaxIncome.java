package org.example.taxes;

public class TaxIncome extends TaxSystem {

    @Override
    public int calcTaxFor(int debit, int credit) {
        return debit * 6 / 100;
    }
}

