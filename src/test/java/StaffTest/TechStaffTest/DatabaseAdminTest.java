package StaffTest.TechStaffTest;

import Staff.TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Michael", "QQ 56 43 21 A", 20000);
    }

    @Test
    public void hasName(){
        assertEquals("Michael", databaseAdmin.getName());
    }

    @Test
    public void hasNIN(){
        assertEquals("QQ 56 43 21 A", databaseAdmin.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(20000, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(50);
        assertEquals(20050, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canCheckPayBonus(){
        assertEquals(200, databaseAdmin.payBonus(), 0.01);
    }

}

