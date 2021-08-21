package IceCreamInheritedClass;


public class VanillaIceCream extends AbstractIceCream{
    @Override
    String descriptionIceCream() {
        return "Vanilla ice cream";
    }

    @Override
    int costOfIceCream() {
        return 25;
    }
}
