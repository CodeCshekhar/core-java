package oops.abstraction;


abstract class Bank {
    abstract int getInterestRate();
}


class BankA extends Bank {
    int getInterestRate() {
        return 5; // Bank A's interest rate is 5%
    }
}

class BankB extends Bank {
    int getInterestRate() {
        return 6; // Bank B's interest rate is 6%
    }
}

class BankC extends Bank {
    int getInterestRate() {
        return 7; // Bank C's interest rate is 7%
    }
}


class BankFactory {
    static Bank getBank(String bankName) {
        if (bankName == null) {
            return null;
        }
        if (bankName.equalsIgnoreCase("A")) {
            return new BankA();
        } else if (bankName.equalsIgnoreCase("B")) {
            return new BankB();
        } else if (bankName.equalsIgnoreCase("C")) {
            return new BankC();
        }
        return null;
    }
}


public class BankExample {
    public static void main(String[] args) {
        Bank bank = BankFactory.getBank("A");
        System.out.println("Bank A interest rate: " + bank.getInterestRate() + "%");

        bank = BankFactory.getBank("B");
        System.out.println("Bank B interest rate: " + bank.getInterestRate() + "%");

        bank = BankFactory.getBank("C");
        System.out.println("Bank C interest rate: " + bank.getInterestRate() + "%");
    }
}
