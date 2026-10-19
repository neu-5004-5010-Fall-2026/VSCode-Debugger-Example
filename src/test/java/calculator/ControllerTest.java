package calculator;

import java.io.Reader;
import java.io.StringReader;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ControllerTest {

    @Test
    void testControllerCanProcessMultipleAddQueries() throws Exception {
        StringBuffer out = new StringBuffer();
        Reader in = new StringReader("+ 3 4 + 8 9 q");
        CalcController controller = new MultiInputCalculatorController(in, out);
        controller.runCalculator(new SimpleCalcModel());
        assertEquals("7\n17\n", out.toString());
    }
}
