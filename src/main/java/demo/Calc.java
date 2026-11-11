package demo;

import java.util.ArrayList;
import java.util.List;

public class Calc {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public String describe(int n) {
        String result = "";
        if (n < 0) { result = "negatif"; }
        else if (n == 0) { result = "zero"; }
        else if (n == 1) { result = "un"; }
        else if (n == 2) { result = "deux"; }
        else if (n == 3) { result = "trois"; }
        else { result = "grand"; }
        List<String> unused = new ArrayList<>();
        return result;
    }
}
