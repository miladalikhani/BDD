package calculator;

public class Calculator {
    public int add(int val1, int val2) {
        return val1 + val2;
    }

    public int div(int val1, int val2) {
        return val1 / val2;
    }

    public int pow(int val1, int val2) {
        int res = 1;
        for (int i = 0; i < val2; i++) {
            res = res * val1;
        }
        return res;
    }
}
