import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Similar to the HashSet class, the LinkedHashSet class can also hold the unique elements only.
 *  -   It facilitates all optional set operations.
 *  -   It is non-synchronized.
 *  -   It allows null elements.
 *  -   The insertion order is maintained by the LinkedHashSet class.
 */
public class LinkedHashsetExample {

    public static void main(String[] args) {

        Set<String> stringSet = new LinkedHashSet<>();

        stringSet.add("A");
        stringSet.addAll(Arrays.asList("B","E","F","C","D","O","Z","L")); // linkedHashSet Maintain order

        System.out.println("stringSet = " + stringSet);

        stringSet.add("");
        stringSet.add("");
        stringSet.add("");

        System.out.println("after insert null stringSet = " + stringSet);

    }
}
