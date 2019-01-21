package main;

public interface ATMFacadeInterface {

    boolean identification(long cardNumber, int pin);

    float checkAccountBalanceATM(long cardNumber);

    String withdrawCash(int amount);
}
