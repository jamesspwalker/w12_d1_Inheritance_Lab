package StaffTest.ManagementTest;

import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("James", "QQ 12 34 56 A", 5000000, "Money");
    }

    @Test
    public void hasName(){
        assertEquals("James", manager.getName());
    }

    @Test
    public void hasNIN(){
        assertEquals("QQ 12 34 56 A", manager.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(5000000, manager.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1000000);
        assertEquals(6000000, manager.getSalary(), 0.1);
    }

    @Test
    public void canCheckPayBonus(){
        assertEquals(50000, manager.payBonus(), 0.01);
    }

    @Test
    public void hasDepartmen(){
        assertEquals("Money", manager.getDeptName());
    }
}
