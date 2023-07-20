package org.example.paragraph1;

public class LowTask12 {

    // Calculation of the function Z = sqrt(R^2 + (w * L - 1/w * C)^2)
    // W - constant
    public double arithmeticExpression(double l, double r, double c) {
        final double W = 0.2;

        double fractionValue = 1 / (W * c);
        double bracketValue = Math.pow(W * l - fractionValue,2);
        double functionValue = Math.pow(r, 2) + bracketValue;

        return functionValue;
    }
}
