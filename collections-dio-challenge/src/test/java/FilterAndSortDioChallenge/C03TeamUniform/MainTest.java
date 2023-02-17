package FilterAndSortDioChallenge.C03TeamUniform;

import FilterAndSortDioChallenge.C02SupermarketList.Main;
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

        final String testString = "9\n" +
                "Maria Jose\n" +
                "branco P\n" +
                "Mangojata Mancuda\n" +
                "vermelho P\n" +
                "Cezar Torres Mo\n" +
                "branco P\n" +
                "Baka Lhau\n" +
                "vermelho P\n" +
                "JuJu Mentina\n" +
                "branco M\n" +
                "Amaro Dinha\n" +
                "vermelho P\n" +
                "Adabi Finho\n" +
                "branco G\n" +
                "Severina Rigudinha\n" +
                "branco G\n" +
                "Carlos Chade Losna\n" +
                "vermelho P\n" +
                "0";

        provideInput(testString);

        Main.main(null);

        final String expected = "branco P Cezar Torres Mo\n" +
                "branco P Maria Jose\n" +
                "branco M JuJu Mentina\n" +
                "branco G Adabi Finho\n" +
                "branco G Severina Rigudinha\n" +
                "vermelho P Amaro Dinha\n" +
                "vermelho P Baka Lhau\n" +
                "vermelho P Carlos Chade Losna\n" +
                "vermelho P Mangojata Mancuda";

        assertEquals(expected, getOutput());
    }
}
