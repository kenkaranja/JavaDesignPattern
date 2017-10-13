package AbstractFactory;

public class AbstractF {
    public FactoryI getFactory(String fact) {
        if (fact.equals("A")) {
            return new AccountFactory();
        } else if (fact.equals("L")) {
            return new LoanFactory();
        } else if (fact.equals("I")) {
            return new InsuranceFactory();
        }
        return null;
    }
}
