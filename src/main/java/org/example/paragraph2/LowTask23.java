package org.example.paragraph2;

public class LowTask23 {

    public double getMiddleNumeric(int a, int b, int c) {
        if ((a >= b && a <= c) || (a <= b && a >= c)) return a;
        else if ((b >= a && b <= c) || (b <= a && b >= c)) return b;
        else return c;
    }
}
