package FilterAndSortDioChallenge.C01EvenAndOddSort;

import java.io.*;
import org.junit.*;
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

        final String testString = "10\n" +
                "4\n" +
                "32\n" +
                "34\n" +
                "543\n" +
                "3456\n" +
                "654\n" +
                "567\n" +
                "87\n" +
                "6789\n" +
                "98";

        provideInput(testString);

        Main.main(null);

        final String expected = "4\n" +
                "32\n" +
                "34\n" +
                "98\n" +
                "654\n" +
                "3456\n" +
                "6789\n" +
                "567\n" +
                "543\n" +
                "87";

        assertEquals(expected, getOutput());
    }
}
