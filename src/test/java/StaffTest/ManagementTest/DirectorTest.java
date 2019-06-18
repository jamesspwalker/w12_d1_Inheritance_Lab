package StaffTest.ManagementTest;

import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Steven Spielberg", "QQ 12 34 56 A", 5000000, "Money", 1000000000);
    }

    @Test
    public void hasName(){

        assertEquals("Steven Spielberg", director.getName());
    }

    @Test
    public void hasNIN(){

        assertEquals("QQ 12 34 56 A", director.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary(){

        assertEquals(5000000, director.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(1000000);
        assertEquals(6000000, director.getSalary(), 0.1);
    }

    @Test
    public void canCheckPayBonus(){

        assertEquals(100000, director.payBonus(), 0.01);
    }

    @Test
    public void hasDepartmen(){

        assertEquals("Money", director.getDeptName());
    }

    @Test
    public void hasBudget(){

        assertEquals(1000000000, director.getBudget(), 0.1);
    }
}
