import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<String,Long> phoneBook = new HashMap<>();
        int numberOfEntry = sc.nextByte();
        System.out.println("numberOfEntry = " + numberOfEntry);



        for (int i = 0; i < numberOfEntry; i++) {
            String st = sc.nextLine();

            Long lg = sc.nextLong();

            phoneBook.put(st,lg);
        }
        System.out.println("phoneBook = " + phoneBook);
    }
}
