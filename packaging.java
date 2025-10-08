public class packaging extends tokens {
    public double Price;
    public int Scale;
    public packaging(int Year, String Month, int Numbers, String Letters, double Price, int Scale) {
        super(Year, Month, Numbers, Letters);
        this.Price = Price;
        this.Scale = Scale;
    }
}
