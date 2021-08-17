import java.util.HashSet;
import java.util.Scanner;

public class SetExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashSet<String> hashSet = new HashSet<>();

        int entry = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < entry; i++) {
            hashSet.add(sc.nextLine());
            System.out.println(hashSet.size());
        }
    }
}

