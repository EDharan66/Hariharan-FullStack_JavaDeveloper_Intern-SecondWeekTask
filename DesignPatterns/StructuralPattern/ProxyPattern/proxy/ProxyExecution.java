package proxy;

public class ProxyExecution implements CommandExecutor{
    private boolean isAdmin;
    private CommandExecutor executor;

    public ProxyExecution(String user, String pwd){
        if("Hariharan".equals(user) && "EDharan".equals(pwd)) isAdmin=true;
        executor = new Execution();
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if(isAdmin){
            executor.runCommand(cmd);
        }else{
            if(cmd.trim().startsWith("rm")){
                throw new Exception("rm command is not allowed for non-admin users.");
            }else{
                executor.runCommand(cmd);
            }
        }
    }
}
