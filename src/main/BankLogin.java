package main;

public class BankLogin {

    public boolean identification(long cardNumber, int pin){
        if (cardNumber == 1234567890 && pin == 1234){
            return true;
        } else {
            return false;
        }
    }

    public void webIdentification(String id, String password){

    }

    public void mobileIdentification(){

    }
}
