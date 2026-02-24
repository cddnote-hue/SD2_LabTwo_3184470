package worksheettwo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ConversionsTest {

    @Test
    void testEuroToDollar() {
        Conversions c = new Conversions();

        assertEquals(110.0, c.euroToDollar(100), 0.0001);
        assertEquals(0.0, c.euroToDollar(0), 0.0001);
        assertEquals(-110.0, c.euroToDollar(-100), 0.0001);
    }

    @Test
    void testDollarToEuro() {
        Conversions c = new Conversions();

        assertEquals(100.0, c.dollarToEuro(110), 0.0001);
        assertEquals(0.0, c.dollarToEuro(0), 0.0001);
        assertEquals(-100.0, c.dollarToEuro(-110), 0.0001);
    }

}