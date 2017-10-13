package Factory;

import AbstractFactory.Account;

public class SavingAccount extends Account {
    public SavingAccount() {
        System.out.println("Saving Account");
    }
}
