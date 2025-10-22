public class meaning {
    String Defination;
    String Notes;

    public meaning(String Defination, String Notes) {
        this.Defination = Defination;
        this.Notes = Notes;
    }

    public void describe() {
        System.out.println("Defination: " + Defination + ", Notes: " + Notes);
    }
}
