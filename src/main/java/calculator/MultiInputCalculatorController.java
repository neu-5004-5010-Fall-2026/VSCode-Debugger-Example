package calculator;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

/**
 * Demonstrates a simple command-line-based calculator
 * with customizable input and output sources. Great for testing
 * controllers without relying on standard input and output.
 */
public class MultiInputCalculatorController implements CalcController {
    private final Readable in;
    private final Appendable out;

    public MultiInputCalculatorController(Readable in, Appendable out) {
        this.in = in;
        this.out = out;
    }

    public void runCalculator(CalcModel calc) throws IOException {
        Objects.requireNonNull(calc);
        int num1, num2;
        Scanner scan = new Scanner(this.in);
        while (true) {
            switch (scan.next()) {
                case "+":
                    num1 = scan.nextInt();
                    num2 = scan.nextInt();
                    this.out.append(
                        String.format("%d\n", calc.add(num1, num2)));
                    break;
                case "q":
                    scan.close();
                    return;
            }
        }
    }
}

