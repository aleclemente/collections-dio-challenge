package FilterAndSortDioChallenge.C02SupermarketList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @Before
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();
    }

    @After
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    @Test
    public void testCase1() throws IOException {

        final String testString = "2\n" +
                "carne laranja suco picles laranja picles\n" +
                "laranja pera laranja pera pera";

        provideInput(testString);

        Main.main(null);

        final String expected = "carne laranja picles suco\n" +
                "laranja pera";

        assertEquals(expected, getOutput());
    }
}
