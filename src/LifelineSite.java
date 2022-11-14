public class LifelineSite extends Site {
    private double _units;
    private double _rate;

    LifelineSite(double units,double rate) {
        _units = units;
        _rate = rate;
    }

    public double getBaseAmount() {
        return _units * _rate * 0.5;
    }

    public double getBillableAmount() {
        double tax = getBaseAmount() * Site.TAX_RATE * 0.2;
        return getBaseAmount() + tax;
    }
}
