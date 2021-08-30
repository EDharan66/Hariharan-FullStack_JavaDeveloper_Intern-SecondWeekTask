import java.util.HashSet;
import java.util.Set;

public class Boublebrase {
    public static void main(String[] args) {

        Set<String> stringSets = new HashSet<String>()
        {
            {
                add("set1");
                add("set2");
                add("set3");
                add("set0");
            }
        };

        System.out.println("stringSets = " + stringSets);

    }
}
