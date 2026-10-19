package calculator;

import static org.junit.jupiter.api.Assertions.*;

import java.io.Reader;
import java.io.StringReader;

import org.junit.jupiter.api.Test;

public class NonNegativeCalcControllerTests {

    @Test
    void testControllerIgnoresNegativeNumbersDuringAdd() throws Exception {
        StringBuffer out = new StringBuffer();
        Reader in = new StringReader("+ -3 3 4 + 3 -4 5 q");
        CalcController controller = new NonNegativeCalcController(in, out);
        controller.runCalculator(new SimpleCalcModel());
        assertEquals("7\n8\n", out.toString());
    }

    @Test
    void testControllerCanQuitMidAdd() throws Exception {
        StringBuffer out = new StringBuffer();
        Reader in = new StringReader("+ -3 3 4 + 3 -4 q");
        CalcController controller = new NonNegativeCalcController(in, out);
        controller.runCalculator(new SimpleCalcModel());
        assertEquals("7\n", out.toString());
    }
}
