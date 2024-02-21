package org.example;
import org.example.taxes.TaxSystem;

public class Company {
        public String title;
        public int debit = 0;
        public int credit = 0;
        public TaxSystem taxSystem;

        public Company ( String title, TaxSystem taxSystem) {
            this.title = title;
            this.taxSystem = taxSystem;
        }

        public void shiftMoney (int amount) {
            if (amount > 0) {
                debit += amount;
            }
            if (amount < 0) {
                credit += Math.abs(amount);
            }
        }

        public void setTaxSystem(TaxSystem taxV) {
            taxSystem = taxV;
        }

        public void payTaxes() {
            int sum = taxSystem.calcTaxFor(debit, credit);
            System.out.println("Компания " + title + " уплатила налог в размере: " + sum + " руб.");
            debit = 0;
            credit = 0;
        }

        public int applyDeals(Deal[] deals) {
            for (Deal deal : deals) {
                if (deal.debitChange != 0) {
                    shiftMoney(deal.debitChange);
                }
                if (deal.creditChange != 0) {
                    shiftMoney(-deal.creditChange);
                }
            }
            int balance = debit - credit;
            payTaxes();
            return balance;
        }
}
