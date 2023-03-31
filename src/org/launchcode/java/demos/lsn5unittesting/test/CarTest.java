package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.launchcode.java.demos.lsn5unittesting.main.Car; //import Car class for testing

public class CarTest {

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest() {
        assertEquals(10, 10, .001);
    }

    Car testCar;

    @Before
    public void createCarObject() {
        testCar = new Car("Toyota", "Prius", 10, 50);
    }

    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank() {
        //Car testCar = new Car("Toyota", "Prius", 10, 50); // create new test object
        assertEquals(10, testCar.getGasTankLevel(), .001); //compare new test object with what is expected
    }

    @Test
    public void testInitialGasTankNotZero() {
        assertFalse(testCar.getGasTankLevel() == 0);
    }

    @Test
    public void testInitialGasTankNotZeroTrue() {
        assertTrue(testCar.getGasTankLevel() == 10);
    }

    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testGasTankAfterDriving() {
        testCar.drive(50);
        assertEquals(9, testCar.getGasTankLevel(), .001);
    }

    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void testGasTankAfterExceedingTankRange() {
        testCar.drive(500); //exceed range
        //System.out.println(testCar.getGasTankLevel());
        assertEquals(0, testCar.getGasTankLevel(), .001);
    }

    //TODO: can't have more gas than tank size, expect an exception
    @Test(expected = IllegalArgumentException.class)
    public void testGasOverfillException() {
        testCar.addGas(5);
        fail("Shouldn't get here, car cannot have more gas in tank than the size of the tank");
    }

}
