package org.example.paragraph1;

public class HighTask12 {

    public void polarCoordinates(double x, double y) {
        double p = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        double f = Math.toDegrees(Math.atan(y / x));

        System.out.println("Полярный радиус равен: " + p);
        System.out.println("Полярный угол равен: " + f);
    }
}
