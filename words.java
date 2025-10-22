public class words extends meaning{
    String Polymorphism;
    String Inheritance;

    public words(String Defination, String Notes, String Polymorphism, String Inheritance) {
        super(Defination, Notes);
        this.Polymorphism = Polymorphism;
        this.Inheritance = Inheritance;
    }

    @Override
    public void describe() {
        System.out.println("Defination: " + Defination + ", Notes: " + Notes + ", Polymorphism: " + Polymorphism + ", Inheritance: " + Inheritance);
    }

    public void explain() {
        System.out.println("This is the explain method in words class.");
    }
}
