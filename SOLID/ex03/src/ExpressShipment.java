public class ExpressShipment extends Shipment {
    public ExpressShipment(double weightKg) {
        super(weightKg);
    }

    public double getBaseCost() {
        return 80;
    }

    public double getRatePerKg() {
        return 8;
    }

    public String getType() {
        return "Express";
    }
}
