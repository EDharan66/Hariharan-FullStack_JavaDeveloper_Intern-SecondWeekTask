import ChainOfResposibility.*;

import java.util.Scanner;

public class ATM {
    private DispenseChain c1;

    public ATM() {
        // initialize the chain
        this.c1 = new Rs2000Dispenser();
        DispenseChain c2 = new Rs500Dispenser();
        DispenseChain c3 = new Rs200Dispenser();
        DispenseChain c4 = new Rs100Dispenser();
        DispenseChain c5 = new Rs50Dispenser();

        // set the chain of responsibility
        c1.setNextChain(c2);
        c2.setNextChain(c3);
        c3.setNextChain(c4);
        c4.setNextChain(c5);

    }

    public static void main(String[] args) {
        ATM atmDispenser = new ATM();
        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 50 != 0) {
                System.out.println("Amount should be in multiple of 50s.");
                return;
            }
            // process the request
            atmDispenser.c1.dispense(new Currency(amount));
        }

    }
}
