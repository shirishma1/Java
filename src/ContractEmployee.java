import java.time.LocalDate;

public class ContractEmployee extends Employee{
    private LocalDate contractStartDate;
    private LocalDate contractEndDate;

    @Override
    void calculateSalary() {
        //calculate salary
    }
}
