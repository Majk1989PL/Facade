package main;

public class BankSystem {

    public float checkTheAccountBalanceOfTheATM(long cardNr){
        if (cardNr == 1234567890) {
            return 356.78f;
        } else {
            return 00.0f;
        }
    }

    public String withdrawCash(int amount){
        return "The account was paid out: " + amount + " PLN.";
    }

    public String cardActivation(long cardNumber) {
        return "Card " + cardNumber + " active.";
    }

    public void webPayment(){

    }

    public void interntetPayment(){

    }

    public void makeTransfer(long fromAccount, long toAccount, float amount){

    }
}
