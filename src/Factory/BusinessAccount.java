package Factory;

import AbstractFactory.Account;

public class BusinessAccount extends Account {
    public BusinessAccount() {
        System.out.println("Business Account");
    }
}
