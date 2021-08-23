import proxy.CommandExecutor;
import proxy.ProxyExecution;

import java.util.Scanner;

public class ProxyExample {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        String name = sc.nextLine();
        String password = sc.nextLine();
        CommandExecutor executor = new ProxyExecution(name, password);
        try {
            executor.runCommand("dir");
            executor.runCommand("rmdir");
        } catch (Exception e) {
            System.out.println("Exception Message::"+e.getMessage());
        }

    }
}
