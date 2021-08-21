package IceCreamInheritedClass;

public class MintChipAdded extends AbstractDecoratorIceCream {

    AbstractIceCream abstractIceCream;

    public MintChipAdded(AbstractIceCream abstractIceCream) {
        this.abstractIceCream = abstractIceCream;
    }

    @Override
    String descriptionIceCream() {
        return "mint chip added with "+abstractIceCream.descriptionIceCream();
    }

    @Override
    int costOfIceCream() {
        return abstractIceCream.costOfIceCream()+20;
    }
}
