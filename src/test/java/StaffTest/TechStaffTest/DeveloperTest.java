package StaffTest.TechStaffTest;

import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before(){

        developer = new Developer("Alison", "QQ 56 43 21 A", 20000);
    }

    @Test
    public void hasName(){

        assertEquals("Alison", developer.getName());
    }

    @Test
    public void hasNIN(){

        assertEquals("QQ 56 43 21 A", developer.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary(){

        assertEquals(20000, developer.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(50);
        assertEquals(20050, developer.getSalary(), 0.1);
    }

    @Test
    public void canCheckPayBonus(){

        assertEquals(200, developer.payBonus(), 0.01);
    }

}
