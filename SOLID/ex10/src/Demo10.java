public class Demo10 {
    public static void main(String[] args) {
        IConsole logger = new ConsoleLogger();
        new ReportService(logger).generate();
    }
}
