public class StandardTaxCalculator implements TaxCalculator {
    private final double taxRate;

    public StandardTaxCalculator(double taxRate){
        this.taxRate = taxRate;
    }
    public double calculateTotalwithTax(double subtotal){
        return subtotal*subtotal*taxRate;
    }
}
