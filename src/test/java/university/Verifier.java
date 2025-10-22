package university;

import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class Verifier {

    @Test
    public void testToUpperCase() {
        assertEquals("ALONG", "aloNG".toUpperCase(Locale.ROOT));
    }

    @Test
    public void testToLowerCase() {
        assertEquals("along", "aloNG".toLowerCase(Locale.ROOT));
    }

    @Test
    public void testCamelCase() {
        assertEquals("alongTo", "alongTo");
    }
}
