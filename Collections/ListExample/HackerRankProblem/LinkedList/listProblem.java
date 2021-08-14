import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class listProblem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sizeOfList = sc.nextInt();
        sc.nextLine();
        LinkedList linkedList = new LinkedList(Arrays.asList(sc.nextLine().split("\\s")));

        System.out.println("linkedList = " + linkedList);
        System.out.println("No of operations");
        int noOfOperations = sc.nextInt();


        for (int i = 0; i < noOfOperations; i++) {
            sc.nextLine();
            String operation = sc.nextLine();
            if(operation.equals("Insert")){
                int index = sc.nextInt();
                if(sc.hasNextInt()){
                    linkedList.add(index,sc.nextInt());
                }else {
                    linkedList.add(index);
                }
            }else if(operation.equals("Delete")) {
                    linkedList.remove(sc.nextInt());
            }
        }

        System.out.println("linkedList = " + linkedList);
        for (Object x : linkedList) {
            System.out.print(x+" ");
        }
    }
}
