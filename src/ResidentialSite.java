public class ResidentialSite extends Site {
    private double _units;
    private double _rate;

    ResidentialSite(double units,double rate) {
        _units = units;
        _rate = rate;
    }

    public double getBaseAmount() {
        return _units * _rate;
    }
    
    public double getBillableAmount() {
        double tax = getBaseAmount() * Site.TAX_RATE;
        return getBaseAmount() + tax;
    }
}
