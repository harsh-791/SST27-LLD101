public class ConsoleLogger implements IConsole {
    public void log(String msg){ 
        System.out.println("[LOG] " + msg); 
    }
}