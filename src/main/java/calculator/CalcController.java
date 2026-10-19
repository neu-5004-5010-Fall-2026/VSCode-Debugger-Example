package calculator;

import java.io.IOException;

/**
 * Expected behaviors of a controller, which only include processing
 * inputs using the given calculator model.
 *
 * Created by Ben on 2/9/2016.
 * Edited by Lucia on 10/15/2026.
 */
public interface CalcController {
    void runCalculator(CalcModel calc) throws IOException;
}
