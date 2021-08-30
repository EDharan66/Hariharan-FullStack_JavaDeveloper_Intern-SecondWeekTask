public class Pen {
    String colour;
    String brandName;
    String penColour;

    Pen(String colour, String brandName, String penColour) {

        this.colour = colour;
        this.brandName = brandName;
        this.penColour = penColour;
    }

    public void displayColour() {
        System.out.println(this.colour);
    }

    public void displayPenBrand() {
        System.out.println(this.brandName);
    }
    public void displayPenColour(){
        System.out.println(this.penColour);
    }

    public static void main(String[] args) {

        Pen obj = new Pen("red","zero","white");
        Pen obj1 = new Pen("black","hero","black");

    }
}

class Bag{
    String brand;
    String space;

    public Bag(String brand,String space) {
        this.brand = brand;
        this.space = space;
    }
}