package IceCreamInheritedClass;

public class DecoratorExampleClass {
    public static void main(String[] args) {


        AbstractIceCream iceCream = new MintChipAdded(new VanillaIceCream());
        System.out.println("iceCream.costOfIceCream() = rs." + iceCream.costOfIceCream());
        System.out.println("iceCream.descriptionIceCream() = " + iceCream.descriptionIceCream());

        AbstractIceCream iceCreamAnother = new MintChipAdded(new ChocolateIceCream());
        System.out.println("iceCream.costOfIceCream() = rs." + iceCreamAnother.costOfIceCream());
        System.out.println("iceCream.descriptionIceCream() = " + iceCreamAnother.descriptionIceCream());
    }
}
