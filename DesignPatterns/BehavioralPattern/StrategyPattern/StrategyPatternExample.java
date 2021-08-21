import Strategy.CreditCardStrategy;
import Strategy.Item;
import Strategy.PaypalStrategy;
import Strategy.ShoppingCart;

import java.util.Scanner;

public class StrategyPatternExample {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner sc = new Scanner(System.in);
        Boolean bool = true;

        while (bool){
            System.out.println("Welcome to shopping cart!!!!");
            System.out.println("============================ ");
            System.out.println("1. Mobile ");
            System.out.println("2. Smart Watch ");
            System.out.println("3. Laptop ");
            System.out.println("4. Hard Drive ");
            System.out.println("============================ ");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option){
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        }
        Item item1 = new Item("1002","mobile",25000);
        Item item2 = new Item("5678","smart watch",15000);

        cart.addItem(item1);
        cart.addItem(item2);

        //pay by paypal
        cart.pay(new PaypalStrategy("hariharan80122@gmail.com", "ED80122"));

        //pay by credit card
        cart.pay(new CreditCardStrategy("Hariharan", "80122544458889", "246", "11/25"));
    }
}
