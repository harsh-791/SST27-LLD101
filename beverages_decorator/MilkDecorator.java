package beverages_decorator;

public class MilkDecorator extends Decorator {
    
    public MilkDecorator(Beverage beverage) {
        super(beverage);
        this.beverage = beverage;
    }

    public int cost(){
        return this.beverage.cost() + 2;
    }
}
