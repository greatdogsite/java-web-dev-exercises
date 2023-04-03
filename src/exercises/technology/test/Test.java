package exercises.technology.test;

import exercises.technology.main.Laptop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Test {
    @org.junit.Test
    public void testGasTankAfterExceedingTankRange() {
        Laptop firstLaptop = new Laptop(500, 4, true, 6);
        assertTrue(firstLaptop.isClunky());
    }

}
