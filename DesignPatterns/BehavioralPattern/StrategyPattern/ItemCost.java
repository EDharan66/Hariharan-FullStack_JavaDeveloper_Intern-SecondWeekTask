import java.util.Scanner;

public class ItemCost {
    int price;
    int itemId;
    int option;
    String itemModelName;
    Scanner sc = new Scanner(System.in);

    public int getPrice() {
        return price;
    }

    public int getItemId() {
        return itemId;
    }

    public String getItemModelName() {
        return itemModelName;
    }

    public ItemCost(String itemName) {
        if (itemName.equalsIgnoreCase("Mobile")) {
            mobileModel();
        } else if (itemName.equalsIgnoreCase("Smart Watch")) {
            smartWatchModel();
        } else if (itemName.equalsIgnoreCase("Laptop")) {
            laptopModel();
        } else if (itemName.equalsIgnoreCase("Hard Drive")) {
            hardDriveModel();
        }
    }

    private void hardDriveModel() {
        System.out.println("Hard Drive!!!!");
        System.out.println("============================ ");
        System.out.println("1. Sony 1 TB : Rs.4000 ");
        System.out.println("2. Samsung 1 TB : Rs.3500 ");
        System.out.println("3. Green 2 TB : Rs.4500");
        System.out.println("============================ ");
        option = sc.nextInt();
        sc.nextLine();
        switch (option) {
            case 1:
                this.itemId = 1401;
                this.price = 4500;
                this.itemModelName = "Sony 1 TB";
                break;
            case 2:
                this.itemId = 1402;
                this.price = 3500;
                this.itemModelName = "Samsung 1 TB";
                break;
            case 3:
                this.itemId = 1403;
                this.price = 4500;
                this.itemModelName = "Green 2 TB";
                break;
            default:
                break;
        }
    }

    private void laptopModel() {
        System.out.println("Laptop model!!!!");
        System.out.println("============================ ");
        System.out.println("1. Acer : Rs.45,000");
        System.out.println("2. Hp : Rs.72,000");
        System.out.println("3. Lenovo : Rs.49,000");
        System.out.println("4. Apple : Rs.1,30,000");
        System.out.println("============================ ");
        option = sc.nextInt();
        sc.nextLine();
        switch (option) {
            case 1:
                this.itemId = 1101;
                this.price = 45000;
                this.itemModelName = "Acer Laptop";
                break;
            case 2:
                this.itemId = 1102;
                this.price = 72000;
                this.itemModelName = "Hp Laptop";
                break;
            case 3:
                this.itemId = 1103;
                this.price = 49000;
                this.itemModelName = "Lenovo Laptop";
                break;
            case 4:
                this.itemId = 1104;
                this.price = 130000;
                this.itemModelName = "Apple Laptop";
                break;
            default:
                break;
        }
    }

    private void smartWatchModel() {
        System.out.println("Welcome to shopping cart!!!!");
        System.out.println("============================ ");
        System.out.println("1. Mi Smart Watch : Rs.6000");
        System.out.println("2. Apple Watch : Rs.30,000");
        System.out.println("3. Samsung : Rs.15,000");
        System.out.println("============================ ");
        option = sc.nextInt();
        sc.nextLine();
        switch (option) {
            case 1:
                this.itemId = 1201;
                this.price = 6000;
                this.itemModelName = "Mi Smart Watch";
                break;
            case 2:
                this.itemId = 1202;
                this.price = 30000;
                this.itemModelName = "Apple Watch";
                break;
            case 3:
                this.itemId = 1203;
                this.price = 15000;
                this.itemModelName = "Samsung";
                break;
            default:
                break;
        }
    }

    private void mobileModel() {
        System.out.println("Welcome to shopping cart!!!!");
        System.out.println("============================ ");
        System.out.println("1. Mi Mobile : Rs.15,000 ");
        System.out.println("2. Samsung Mobile : Rs.25,000 ");
        System.out.println("3. Vivo Mobile : Rs.16,000");
        System.out.println("4. Apple Mobile : Rs.86,000 ");
        System.out.println("============================ ");
        option = sc.nextInt();
        sc.nextLine();
        switch (option) {
            case 1:
                this.itemId = 1301;
                this.price = 15000;
                this.itemModelName = "Mi Mobile";
                break;
            case 2:
                this.itemId = 1302;
                this.price = 25000;
                this.itemModelName = "Samsung Mobile";
                break;
            case 3:
                this.itemId = 1303;
                this.price = 16000;
                this.itemModelName = "Vivo Mobile";
                break;
            case 4:
                this.itemId = 1304;
                this.price = 86000;
                this.itemModelName = "Apple Mobile";
                break;
        }
    }
}
