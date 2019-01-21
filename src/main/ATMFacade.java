package main;

public class ATMFacade implements ATMFacadeInterface {

    private BankSystem bankSystem;
    private BankLogin bankLogin;

    public ATMFacade() {
        bankSystem = new BankSystem();
        bankLogin = new BankLogin();
    }

    @Override
    public boolean identification(long cardNumber, int pin) {
        boolean correct = false;
        correct = bankLogin.identification(cardNumber, pin);
        return correct;
    }

    @Override
    public float checkAccountBalanceATM(long cardNumber) {
        float accountBalance = 0.00f;
        accountBalance = bankSystem.checkTheAccountBalanceOfTheATM(cardNumber);
        return accountBalance;
    }

    @Override
    public String withdrawCash(int amount) {
        return bankSystem.withdrawCash(amount);
    }
}
