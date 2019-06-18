package Staff.Management;

public class Director extends Manager {
    private double budget;

    public Director(String name, String nationalInsuranceNumber, double salary, String deptName, double budget){
        super(name, nationalInsuranceNumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }

    public double payBonus(){
        double salary = this.getSalary();
        return salary / 50;
//        return super.payBonus()*2;
    }
}
