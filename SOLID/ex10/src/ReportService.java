public class ReportService {
    IConsole logger;
    public ReportService(IConsole logger){
        this.logger = logger;
    }
    void generate(){
        logger.log("Generating daily report...");
        System.out.println("Report contents...");
    }
}