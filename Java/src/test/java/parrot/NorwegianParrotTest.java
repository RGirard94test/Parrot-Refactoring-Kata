package parrot;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NorwegianParrotTest {

    @Test
    public void isShouldReturnNorwegianParrotSpeed() {
        //GIVEN
        NorwegianParrot coco = new NorwegianParrot("NORWEGIAN_BLUE", 1, 12, false);
        double expected = 24.0;
        //WHEN
        double actual = coco.getSpeed();
        //THEN
        assertEquals(expected, actual, 0.0);
    }
}