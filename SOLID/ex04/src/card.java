public class card extends Payment{

    public card(double amount){
        super(amount);
    }

    public String getString(){
        return "Charged card: ";
    }
}
