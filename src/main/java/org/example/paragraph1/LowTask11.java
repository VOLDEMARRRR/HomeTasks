package org.example.paragraph1;


public class LowTask11 {

    // Calculation of the function K=ln(p^2 + y^3) + e^p
    public double arithmeticExpression(double p, double y) {

        double bracketValue = Math.pow(p,2) + Math.pow(y,3);
        double functionValue = Math.log(bracketValue) + Math.exp(p);
        return functionValue;

    }
}
