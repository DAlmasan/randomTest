package university;

import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class Testing {

    @Test
    public void testUpperCase() {
        assertEquals("ALONG", "aloNG".toUpperCase(Locale.ROOT));
    }

    @Test
    public void testLowerCase() {
        assertEquals("along", "aloNG".toLowerCase(Locale.ROOT));
    }


}
