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
        int option;

        while (bool) {
            System.out.println("Welcome to shopping cart!!!!");
            System.out.println("============================ ");
            System.out.println("1. Mobile ");
            System.out.println("2. Smart Watch ");
            System.out.println("3. Laptop ");
            System.out.println("4. Hard Drive ");
            System.out.println("============================ ");
            option = sc.nextInt();
            sc.nextLine();
            ItemCost itemCost;
            Item item = null;
            switch (option) {
                case 1:
                    itemCost = new ItemCost("Mobile");
                    item = new Item(String.valueOf(itemCost.getItemId()), itemCost.getItemModelName(), itemCost.getPrice());
                    break;
                case 2:
                    itemCost = new ItemCost("Smart Watch");
                    item = new Item(String.valueOf(itemCost.getItemId()), itemCost.getItemModelName(), itemCost.getPrice());

                    break;
                case 3:
                    itemCost = new ItemCost("Laptop");
                    item = new Item(String.valueOf(itemCost.getItemId()), itemCost.getItemModelName(), itemCost.getPrice());

                    break;
                case 4:
                    itemCost = new ItemCost("Hard Drive");
                    item = new Item(String.valueOf(itemCost.getItemId()), itemCost.getItemModelName(), itemCost.getPrice());
                    break;
                default:
                    System.out.println("choose correct");
                    break;
            }
            cart.addItem(item);
            System.out.println("Do you want to continue enter true/false");
            bool = sc.nextBoolean();
        }
//        Item item1 = new Item("1002", "mobile", 25000);
//        Item item2 = new Item("5678", "smart watch", 15000);


        System.out.println("Which option you want to pay!!!");
        System.out.println("============================ ");
        System.out.println("1. PayPal ");
        System.out.println("2. CreditCard ");
        System.out.println("============================ ");
        option = sc.nextInt();
        sc.nextLine();
        switch (option){
            case 1:
                System.out.println("Enter mail id : ");
                String mailId = sc.nextLine();
                System.out.println("Enter password : ");
                String password = sc.nextLine();

                cart.pay(new PaypalStrategy(mailId, password));
                break;
            case 2:
                System.out.println("Enter Name : ");
                String name = sc.nextLine();
                System.out.println("Enter Credit card : ");
                String ccNum = sc.nextLine();
                System.out.println("Enter cvv no : ");
                String cvv = sc.nextLine();
                System.out.println("Enter expire date : ");
                String expireDate = sc.nextLine();

                cart.pay(new CreditCardStrategy(name, ccNum, cvv, expireDate));
                break;
        }


    }
}
