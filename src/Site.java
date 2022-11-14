public abstract class Site {
    final static double TAX_RATE = 0.13;

    public abstract double getBaseAmount();
    public abstract double getTaxAmount();
}
