public class Main {
    public static void main(String[] args) {
        accounts acc = new accounts(13, "dean", 5000);
        acc.showaccountsdetails();
        
        student stu = new student(1, "dean", "BIT", acc);
        stu.showstudentdetails();
      
        models mod = new models(2025, "April");
        System.out.println("Year: " + mod.getYear());
        System.out.println("Month: " + mod.Month);
        
        tokens tok = new tokens(2025, "April", 42, "ABC");
        System.out.println("Numbers: " + tok.getNumbers());
        System.out.println("Letters: " + tok.getLetters());
        
        packaging pack = new packaging(2025, "April", 42, "ABC", "100", 10);
        System.out.println("Price: " + pack.Price);
        System.out.println("Scale: " + pack.Scale);

        drivers d = new drivers();
        d.displaymethods();
    }
}
