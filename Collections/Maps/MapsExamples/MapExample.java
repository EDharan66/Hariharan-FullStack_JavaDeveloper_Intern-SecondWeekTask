import java.util.*;

public class MapExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<String,Long > phoneBook = new HashMap<>();
        List<String> stringList = new ArrayList<>();
        int numberOfEntry = sc.nextInt();
        sc.nextLine();
        //System.out.println("numberOfEntry = " + numberOfEntry);



        for (int i = 0; i < numberOfEntry; i++) {
            String st = sc.next();
            if(!sc.hasNextLong()){
                st = st +" "+ sc.next();
            }
            Long lg = sc.nextLong();

            phoneBook.put(st,lg);
        }
        //System.out.println("phoneBook = " + phoneBook);

        sc.nextLine();
        while(sc.hasNext()) {
            String name = sc.nextLine();
            Long phone = phoneBook.get(name);
            System.out.println(phone != null ? name + "=" + phone : "Not found");
        }


    }
}
