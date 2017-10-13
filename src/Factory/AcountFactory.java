package Factory;

import AbstractFactory.Account;

public class AcountFactory {
    public Account create(String type) {
        if (type.equals("business")) {
            return new BusinessAccount();
        } else if (type.equals("saving")) {
            return new SavingAccount();
        }
        return null;
    }
}
