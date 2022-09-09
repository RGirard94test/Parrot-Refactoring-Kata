package parrot;

import org.junit.Test;

import static java.awt.font.NumericShaper.EUROPEAN;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class ParrotTest {

    @Test
    public void getSpeedOfEuropeanParrot() {
        Parrot parrot = new Parrot("EUROPEAN", 0, 0, false);
        assertEquals(12.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_One_Coconut() {
        Parrot parrot = new Parrot("AFRICAN", 1, 0, false);
        assertEquals(3.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_Two_Coconuts() {
        Parrot parrot = new Parrot("AFRICAN", 2, 0, false);
        assertEquals(0.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_No_Coconuts() {
        Parrot parrot = new Parrot("AFRICAN", 0, 0, false);
        assertEquals(12.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_nailed() {
        Parrot parrot = new Parrot("NORWEGIAN_BLUE", 0, 1.5, true);
        assertEquals(0.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed() {
        Parrot parrot = new Parrot("NORWEGIAN_BLUE", 0, 1.5, false);
        assertEquals(18.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed_high_voltage() {
        Parrot parrot = new Parrot("NORWEGIAN_BLUE", 0, 4, false);
        assertEquals(24.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void itShouldThrowWhenUnknownTypeOfParrot(){
        Parrot parrot = new Parrot("AUSTRALIAN", 0, 4, false);
        assertThrows(RuntimeException.class, () -> { parrot.getSpeed(); });
    }
}
