
import java.util.*;


public class StringProblem extends sample1 implements sample{

//    static void num(){
//        System.out.println("string problem num");
//    }



    public void s(){
        System.out.println("helohei");
    }

    public static void main(String[] args) {

        //isPalindrome();
        //isAnagram();
//        System.out.println(System.getProperty("os.name"));
//        geeksforgeeks
//        forgeeksgeeks

        sample1 sp = new sample1();
        num();
    }


    private static void isAnagram() {
        Scanner sc =  new Scanner(System.in);
        char[] ch = sc.nextLine().toCharArray();
        char[] ch1 = sc.nextLine().toCharArray();
        HashSet<String> strings = new HashSet<>();


        Arrays.sort(ch1);
        Arrays.sort(ch);

        strings.add(String.valueOf(ch1));
        strings.add(String.valueOf(ch));

        System.out.println("strings = " + strings);
        if(strings.size() == 1){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }



    }

    private static void isPalindrome() {
        Scanner sc =  new Scanner(System.in);
        Boolean bool = true;
        String word = sc.nextLine();
        String reverse = new StringBuilder(word).reverse().toString();
        System.out.println(reverse);

        for (int i = 0; i < word.length() / 2; i++) {
         if(word.charAt(i)!=reverse.charAt(i)){
             bool = false;
             break;
         }
        }
        System.out.println(word+ " is "+(bool?"palindrome":"not a palindrome"));
    }
}

interface sample{
    default void saple(){
        System.out.println("hai");
    }
    default void s(){
        System.out.println("hello");
    }
}

class sample1{
    static void num(){
        System.out.println("sample1 num");
    }
}
