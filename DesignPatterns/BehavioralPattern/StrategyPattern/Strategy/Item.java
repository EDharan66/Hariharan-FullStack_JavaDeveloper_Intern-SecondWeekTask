package Strategy;

public class Item {

    private String upcCode;
    private String itemName;
    private int price;

    public Item(String upc, String itemName, int cost) {
        this.upcCode = upc;
        this.price = cost;
        this.itemName = itemName;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public int getPrice() {
        return price;
    }

    public String getItemName() {
        return itemName;
    }
}