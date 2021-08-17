import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String symbol = sc.nextLine();
            System.out.println(chechMethod(symbol));
        }

    }

    private static Boolean chechMethod(String symbol) {
        Boolean checkVal = true;

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < symbol.length(); i++) {
            char ch = symbol.charAt(i);
            if(ch== '{'|| ch=='[' || ch=='('){
                stack.push(ch);
            }else {
                try{
                    if(ch == '}'&&stack.peek().equals('{')){
                        stack.pop();
                    }else if(ch == ')'&&stack.peek().equals('(')){
                        stack.pop();

                    }else if(ch == ']'&&stack.peek().equals('[')){
                        stack.pop();

                    }else {
                        return false;
                    }
                }catch (EmptyStackException e){
                    return false;
                }

            }
        }
        if(checkVal && stack.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}
