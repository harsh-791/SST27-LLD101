public class StandardShipment extends Shipment {
    public StandardShipment(double weightKg) {
        super(weightKg);
    }

    public double getBaseCost() {
        return 50;
    }

    public double getRatePerKg() {
        return 5;
    }

    public String getType() {
        return "Standard";
    }
}
