package parrot;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class EuropeanParrotTest {
    @Test
    public void getSpeedOfEuropeanParrot() {
        EuropeanParrot parrot = new EuropeanParrot();
        assertEquals(12.0, parrot.getSpeed(), 0.0);
    }
}
