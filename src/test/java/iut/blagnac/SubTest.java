package iut.blagnac;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SubTest {
    @Test
    public void testSubNombrePositif() {
        Sub sub = new Sub();
        assertEquals(2, sub.sub(5, 3));
    }
    
    @Test
    public void testSubNombreNegatif() {
        Sub sub = new Sub();
        assertEquals(-8, sub.sub(-5, 3));
    }

    @Test
    public void testSubZero() {
        Sub sub = new Sub();
        assertEquals(0, sub.sub(0, 0));
    }

    @Test
    public void testSubResultatNegatif() {
        Sub sub = new Sub();
        assertEquals(-1, sub.sub(2, 3));
    }
}
