package iut.blagnac;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestAdd {
    // commentaire de Severin
    @Test
    public void addTest() {
        final int expected = 4;
	    final int actual = Add.add(2, 2);
	    assertEquals(expected, actual, "2 + 2 = 4");
    }
}
