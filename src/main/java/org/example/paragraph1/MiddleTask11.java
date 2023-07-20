package org.example.paragraph1;

public class MiddleTask11 {

    // Calculation of the function F = ln(d) + ((3,5 * d^2 + 1) / cos2y)
    // y - degrees
    public double arithmeticExpression(double d, double y){

        double numeratorValue = 3.5 * Math.pow(d, 2) + 1;
        double radians = Math.toRadians(2 * y);
        double denominatorValue = Math.cos(radians);
        double fractionValue = numeratorValue / denominatorValue;
        double functionValue = Math.log(d) + fractionValue;

        return functionValue;
    }

}
