package org.launchcode.techjobs_oo.Tests;


import com.sun.jdi.IntegerType;
import org.junit.Before;
import org.launchcode.techjobs_oo.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


public class JobTest {
    Job test_job1;
    Job test_job2;
    Job test_job3;
    Job test_job4;
    Job test_job5;

    @Before
    public void createJobObjects() {
        test_job1 = new Job("Junior Developer", new Employer("Boeing"), new Location("St. Louis"), new PositionType("Backend"), new CoreCompetency("Patience"));
        test_job2 = new Job("Senior Developer", new Employer("Google"), new Location("Silicon Valley"), new PositionType("Frontend"), new CoreCompetency("Team Player"));
        test_job3 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job4 = new Job("Junior Developer", new Employer("Facebook"), new Location("Silicon Valley"), new PositionType("Front End"), new CoreCompetency("Spunk"));
        test_job5 = new Job("Junior Developer", new Employer("Facebook"), new Location("Silicon Valley"), new PositionType("Front End"), new CoreCompetency("Spunk"));
    }

    @Test
    public void testSettingJobId() {
        assertTrue(test_job1.getId() != test_job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {

        assertEquals(3, test_job3.getId());

        assertTrue(test_job3.getName() instanceof String);
        assertEquals("Product Tester", test_job3.getName());

        assertTrue(test_job3.getEmployer() instanceof Employer);
        assertEquals("ACME", test_job3.getEmployer().getValue());

        assertTrue(test_job3.getLocation() instanceof Location);
        assertEquals("Desert", test_job3.getLocation().getValue());

        assertTrue(test_job3.getPositionType() instanceof PositionType);
        assertEquals("Quality control", test_job3.getPositionType().getValue());

        assertTrue(test_job3.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", test_job3.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(test_job4.equals(test_job5));
    }
}
