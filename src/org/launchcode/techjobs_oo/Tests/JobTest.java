package org.launchcode.techjobs_oo.Tests;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.launchcode.techjobs_oo.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JobTest {

    @Test
    public void a_testSettingJobId() {
        Job test_job1 = new Job("Junior Developer", new Employer("Boeing"), new Location("St. Louis"), new PositionType("Backend"), new CoreCompetency("Patience"));
        Job test_job2 = new Job("Senior Developer", new Employer("Google"), new Location("Silicon Valley"), new PositionType("Frontend"), new CoreCompetency("Team Player"));
        assertTrue(test_job1.getId() != test_job2.getId());
        System.out.println(test_job1.toString());
        System.out.println(test_job2);
    }

    @Test
    public void b_testJobConstructorSetsAllFields() {
        Job test_job3 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        System.out.println(test_job3.toString());
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
    public void c_testJobsForEquality() {
        Job test_job4 = new Job("Junior Developer", new Employer("Facebook"), new Location("Silicon Valley"), new PositionType("Front End"), new CoreCompetency("Spunk"));
        Job test_job5 = new Job("Junior Developer", new Employer("Facebook"), new Location("Silicon Valley"), new PositionType("Front End"), new CoreCompetency("Spunk"));
        assertFalse(test_job4.equals(test_job5));
        System.out.println(test_job4.toString());
        System.out.println(test_job5.toString());
    }

    @Test
    public void d_toStringCreatesBlankFirstAndLastLine() {
        Job test_job6 = new Job("Senior Developer", new Employer("Verizon"), new Location("St. Louis"), new PositionType("Back End"), new CoreCompetency("Determination"));
        System.out.println(test_job6.toString());
        assertEquals("\n" +
                "ID: " + 6 +
                "\n" +
                "Name: " + "Senior Developer" +
                "\n" +
                "Employer: " + "Verizon" +
                "\n" +
                "Location: " + "St. Louis" +
                "\n" +
                "Position Type: " + "Back End" +
                "\n" +
                "Core Competency: " + "Determination" +
                "\n", test_job6.toString());

    }

    @Test
    public void e_toStringContainsLabelForEachField() {
        Job test_job7 = new Job("Senior Developer", new Employer("Verizon"), new Location("St. Louis"), new PositionType("Back End"), new CoreCompetency("Determination"));
        System.out.println(test_job7.toString());
        assertEquals("\n" +
                "ID: " + 7 +
                "\n" +
                "Name: " + "Senior Developer" +
                "\n" +
                "Employer: " + "Verizon" +
                "\n" +
                "Location: " + "St. Louis" +
                "\n" +
                "Position Type: " + "Back End" +
                "\n" +
                "Core Competency: " + "Determination" +
                "\n", test_job7.toString());
    }

    @Test
    public void f_toStringContainsNotAvailableIfEmpty() {
        Job test_job8 = new Job("Senior Developer", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        System.out.println(test_job8.toString());
        assertEquals("\n" +
                "ID: " + 8 +
                "\n" +
                "Name: " + "Senior Developer" +
                "\n" +
                "Employer: " + "Data not available." +
                "\n" +
                "Location: " + "Data not available." +
                "\n" +
                "Position Type: " + "Data not available." +
                "\n" +
                "Core Competency: " + "Data not available." +
                "\n", test_job8.toString());
    }

    @Test
    public void g_toStringContainsOopsIfOnlyIdField() {
        Job test_job9 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        System.out.println(test_job9.toString());
        assertEquals("OOPS! This job does not seem to exist.", test_job9.toString());
    }
}





