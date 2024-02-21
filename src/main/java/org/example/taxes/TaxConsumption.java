package org.example.taxes;

public class TaxConsumption extends TaxSystem{

    @Override
    public int calcTaxFor(int debit, int credit) {
        return  (debit - credit) * 15 / 100;
    }
}
