public class tokens extends models{
    private int Numbers;
    public String Letters;
    public tokens(int Year, String Month, int Numbers, String Letters) {
        super(Year, Month);
        this.Numbers = Numbers;
        this.Letters = Letters;
    }
    public int getNumbers() {
        return Numbers;
    }
    public String getLetters() {
        return Letters;
    }
}
