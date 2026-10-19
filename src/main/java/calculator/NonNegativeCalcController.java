package calculator;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

/**
 * Controller implementation that silently ignores negative numbers
 * during add operations. Instead, it keeps reading until a zero, positive
 * number, or q are entered.
 */
public class NonNegativeCalcController implements CalcController {
    private final Readable in;
    private final Appendable out;

    public NonNegativeCalcController(Readable in, Appendable out) {
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
                    num1 = readNonNegNumber(scan);
                    num2 = readNonNegNumber(scan);
                    this.out.append(
                        String.format("%d\n", calc.add(num1, num2)));
                    break;
                case "q":
                    scan.close();
                    return;
            }
        }
    }

    // Reads from scanner until there is no input or valid
    // non-negative number is read.
    // Throws IOException if scanner runs out of input before
    // a valid number is found.
    private int readNonNegNumber(Scanner scan) throws IOException {
        while(scan.hasNext()) {
            if (scan.hasNextInt()) {
                int value = scan.nextInt();
                if (value >= 0) {
                    return value;
                }
            }
        }
        throw new IOException("Ran out of input");
    }
}
