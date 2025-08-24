public abstract class Payment {
    double amount;
    Payment(double a){ 
        amount=a;
    }

    public String getCost(){
        return getString() + amount;
    }

    public abstract String getString();
}