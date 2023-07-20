package org.example.paragraph1;

public class HighTask11 {

    // Calculation of the function L = ctg^2 c + ((2*x^2 + 5) / (c + t)^1/2)
    //c - radians
    public double arithmeticExpression(double c, double x, double t) {

        double numeratorValue = 2 * Math.pow(x, 2) + 5;
        double denominatorValue = Math.sqrt(c + t);
        double fractionValue = numeratorValue / denominatorValue;
        double ctgValue = Math.pow(1 / Math.tan(c), 2);
        double functionValue = fractionValue + ctgValue;

        return functionValue;
    }
}
