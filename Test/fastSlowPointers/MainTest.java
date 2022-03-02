package fastSlowPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static fastSlowPointers.Main.*;

class MainTest {

    @Test
    void test1() {
        assertEquals(true, happyNumber(19));
        assertEquals(false, happyNumber(2));
        assertEquals(true, happyNumber(23));
        assertEquals(false, happyNumber(12));
    }
}