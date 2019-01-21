package main;

import java.util.Scanner;

public class ATM {

    private ATMFacade atmFacade = new ATMFacade();
    private static ATM atm = new ATM();

    public static void main(String[] args) {
        atm.atmStart();
    }

    public void atmStart() {

        int pin = 0;
        boolean authorization = false;

        System.out.println("======= WITAJ W BANKOMACIE SZEMRANEGO BANKU ======\n");
        System.out.println("=======     Włóż kartę i podaj kod PIN      ======\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("kod PIN: ");
        pin = sc.nextInt();

        System.out.println("Authorization...\n");

        authorization = atmFacade.identification(1234567890, pin);
        if (authorization) {
            atm.showMenu();
        } else {
            System.out.println("Autoryzacja nie powiodła się. Karta została zatrzymana. ");
            atm.end();
        }
    }

    public void showMenu() {

        System.out.println("======= MENU =======");
        System.out.println("1. Stan konta");
        System.out.println("2. Wypłata gotówki");
        System.out.println("3. Koniec\n");

        System.out.println("Wybierz: ");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                atm.displayAccountBalance(1234567890);
                break;
            case 2:
                atm.withdrawCash(260);
                break;
            case 3:
                atm.end();
                break;
            default:
                atm.showMenu();
        }
    }

    public void displayAccountBalance(long cardNumber) {
        System.out.println(atmFacade.checkAccountBalanceATM(cardNumber));
    }

    public void withdrawCash(int amount) {
        String payment = atmFacade.withdrawCash(amount);
        System.out.println(payment);
        System.out.println("Odbierz kartę.");
        atm.end();
    }

    public void end(){
        System.exit(0);
    }
}
