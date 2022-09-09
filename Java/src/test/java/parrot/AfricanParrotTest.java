package parrot;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AfricanParrotTest {
    @Test
    public void isShouldReturnNorwegianParrotSpeed() {
        //GIVEN
        AfricanParrot coco = new AfricanParrot(1);
        double expected = 3.0;
        //WHEN
        double actual = coco.getSpeed();
        //THEN
        assertEquals(expected, actual, 0.0);
    }
}
