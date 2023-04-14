import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class firstIFTest {

    @Test
    void seyHello() {
        firstIF f = new first();
        String actuel = f.seyHello();
        assertEquals( "Hello Word", actuel);
    }
}