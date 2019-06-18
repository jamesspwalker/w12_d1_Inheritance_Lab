package StaffTest;

import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void before(){
        employee = new Employee("James", "QQ 12 34 56 A", 5000);
    }

    @Test
    public void hasName(){

        assertEquals("James", employee.getName());
    }

    @Test
    public void canNotChangeNameIfEmptyString(){
        employee.setName("");
        assertEquals("James", employee.getName());
    }

    @Test
    public void hasNIN(){
        assertEquals("QQ 12 34 56 A", employee.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(5000, employee.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        employee.raiseSalary(10);
        assertEquals(5010, employee.getSalary(), 0.1);
    }

    @Test
    public void canNotLowerSalary(){
        employee.raiseSalary(-10);
        assertEquals(5000, employee.getSalary(), 0.1);
    }

    @Test
    public void canCheckPayBonus(){
        assertEquals(50, employee.payBonus(), 0.01);
    }

}
