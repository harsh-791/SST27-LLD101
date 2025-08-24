public abstract class Shipment {
    private double weightKg;
    
    public Shipment(double weightKg) {
        this.weightKg = weightKg;
    }
    
    public final double getCost() {
        return getBaseCost() + getRatePerKg() * weightKg;
    }
    
    // Abstract methods that subclasses must implement
    protected abstract double getBaseCost();
    protected abstract double getRatePerKg();
    public abstract String getType();

}