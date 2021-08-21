import Template.GlassHouse;
import Template.HouseTemplate;
import Template.WoodenHouse;

public class TemplatePatternExample {
    public static void main(String[] args) {

        HouseTemplate houseType = new WoodenHouse();

        //using template method
        houseType.buildHouse();
        System.out.println("************");

        houseType = new GlassHouse();

        houseType.buildHouse();
    }
}
