public class UPI extends Payment {
    public UPI(double amount){
        super(amount);
    }

    public String getString(){
        return "Paid via UPI: ";
    }
}
