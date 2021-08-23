package proxy;

public class Execution implements CommandExecutor{
    @Override
    public void runCommand(String cmd) throws Exception {

        System.out.println("'" + cmd + "' command executed.");
    }
}
