import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DataOperation obj = new HelperClass();
        Boolean bool = true;
        int option;

        while (bool.equals(true)){
            System.out.println("Contact info storage");
            System.out.println("====================");
            System.out.println("choose the option!");
            System.out.println("1. store the data");
            System.out.println("2. shows the data");
            System.out.println("3. search the data");
            System.out.println("4. update the data");
            System.out.println("5. delete the data");
            System.out.println("6. exit");
            System.out.println("====================");
            System.out.print("enter your option: ");
            option = sc.nextInt();
            switch (option){
                case 1 :
                    System.out.println(obj.storeData());
                    break;
                case 2 :
                    System.out.println(obj.showData());
                    break;
                case 3 :
                    System.out.println(obj.searchData());
                    break;
                case 4 :
                    System.out.println(obj.updateData());
                    break;
                case 5 :
                    System.out.println(obj.deleteData());
                    break;
                case 6 :
                    System.exit(0);
                    break;
                default :
                    System.out.println("Your option was not correct! please enter correctly");
                    break;
            }

            System.out.println("Do you want continue! enter \"true\" or \"false\"");
            bool = sc.nextBoolean();

        }

    }
}
