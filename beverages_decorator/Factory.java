package beverages_decorator;

public class Factory {

    public static Beverage addMilk(Beverage beverage){
        return new MilkDecorator(beverage);
    }
    
}
