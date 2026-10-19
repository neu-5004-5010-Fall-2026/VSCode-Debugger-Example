package calculator;

/**
 * Basic implementation of a Calculator that can only add integers.
 */
public class SimpleCalcModel implements CalcModel {

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    
}
