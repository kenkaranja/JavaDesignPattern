package AbstractFactory;

import Factory.BusinessAccount;
import Factory.SavingAccount;

public class AccountFactory implements FactoryI {
    @Override
    public Product create(String type) {
        if (type.equals("business")) {
            return new AbstractFactory.BusinessAccount();
        }
        else if(type.equals("saving")){
            return new AbstractFactory.SavingAccount();
        }
        return null;
    }
}
