public class OvernightShipment extends Shipment {
    public OvernightShipment(double weightKg) {
        super(weightKg);
    }

    public double getBaseCost() {
        return 120;
    }

    public double getRatePerKg() {
        return 10;
    }

    public String getType() {
        return "Overnight";
    }
}
