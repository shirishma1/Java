import java.time.LocalDate;

public abstract class Employee {
    int id;
    String name;
    LocalDate dob;
    enum gender{Male, Female};
    int phone;
    String emailId;

    abstract void calculateSalary();

}
