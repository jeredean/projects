public class student {
    int id;
    String name;
    String course;
    accounts accountsinformation;
    
    public student(int id, String name, String course, accounts accountsinformation) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.accountsinformation = accountsinformation;
    }

    public void showstudentdetails() {
        System.out.println("Student id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course); 
    }


}
