package IceCreamInheritedClass;

public class ChocolateIceCream extends AbstractIceCream{
    @Override
    String descriptionIceCream() {
        return "Chocolate Ice cream";
    }

    @Override
    int costOfIceCream() {
        return 50;
    }
}
