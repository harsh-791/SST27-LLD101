public class wallet extends Payment{

    public wallet(double amount){
        super(amount);
    }

    public String getString(){
        return "Wallet debit: ";
    }
    
}
