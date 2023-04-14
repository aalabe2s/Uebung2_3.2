import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeIFTest {

    @Test
    void zeit() {
        TimeIF t = new Time();
        float actual = t.zeit(1.49F);
        assertEquals(actual, 1.49F);
    }

    @Test
    void zeit_addieren() {
        Time t1_1 = new Time();
        Time t2_2 = new Time();
        TimeIF t3 = new Time();
        float actual = t3.zeit_addieren(t1_1, t2_2, 1.40F, 1.59F);
        assertEquals(actual, 1.40F + 1.59F);

    }
}