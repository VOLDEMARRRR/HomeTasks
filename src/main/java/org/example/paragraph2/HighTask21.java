package org.example.paragraph2;

public class HighTask21 {

    public boolean isPointInSector(double x, double y) {

        return Math.pow(x, 2) + Math.pow(y, 2) > 1 && x + y <= 2 && x <=1 && y <= 1;

    }
}
