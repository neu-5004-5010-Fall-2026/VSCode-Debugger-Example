package calculator;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Driver for the calculator program. Accepts inputs from standard in (i.e. terminal)
 * and sends outputs to standard out (i.e. also terminal).
 */
public class CalculatorApp {
    public static void main(String[] args) {
        try {
            new MultiInputCalculatorController(new InputStreamReader(System.in), System.out)
                .runCalculator(new SimpleCalcModel());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
