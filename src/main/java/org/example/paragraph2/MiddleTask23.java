package org.example.paragraph2;

public class MiddleTask23 {

    public double calculationFunction(double x) {
        final double A = 0.2;
        final double B = 0.8;
        final double Z = Math.exp(x);

        if (x < 3.5 * A) {
            return (A * B * x) - Math.pow(Math.cos(Z * x), 2);
        }
        if (x >= 3.5 * A && x <= B) {
            return Math.pow(A - x, 2) - Math.log(Z + x);
        }
        if (x > B) {
            return Math.sqrt(B * x - A + Z * x * x);
        }

        return 0;
    }
}
