package Staff;

public class Employee {

    private String name;
    private String nationalInsuranceNumber;
    private double salary;

    public Employee(String name, String nationalInsuranceNumber, double salary ){
        this.name = name;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
        this.salary = salary;
    }

    public String getName() {

        return this.name;
    }

    public void setName(String newName){

        if(newName.length() > 0)
        this.name = newName;
    }

    public String getNationalInsuranceNumber() {

        return this.nationalInsuranceNumber;
    }


    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double raise) {
        if (raise > 0)
        this.salary += raise;
    }

    public double payBonus() {
        return this.salary/100;
    }
}
