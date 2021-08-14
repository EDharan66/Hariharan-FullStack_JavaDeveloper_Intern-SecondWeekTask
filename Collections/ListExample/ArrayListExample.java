import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //System.out.println("How many list value you enter : ");
        int lists = sc.nextInt();
        sc.nextLine();

        ArrayList<List<String>> sublist = new ArrayList<>();
        List<String> answerList = new ArrayList<String>();

        //System.out.println("Now you enter the lists " + lists);
        for (int i = 0; i < lists; i++) {

            if(sc.hasNextLine()){
                sublist.add(Arrays.asList(sc.nextLine().split("\\s")));
            }
        }
//        System.out.println("sublist = " + sublist);
//
//        System.out.println("verify lists ");

        int verifyCount = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < verifyCount; i++) {
            int rowIndex = sc.nextInt();
            int columIndex = sc.nextInt();
            try {
                    answerList.add(sublist.get(rowIndex-1).get(columIndex));

            }catch (ArrayIndexOutOfBoundsException e){
                answerList.add("ERROR!");
            }
        }

        for (String x : answerList) {
            System.out.println(x);
        }

    }

}
