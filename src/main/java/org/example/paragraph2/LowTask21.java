package org.example.paragraph2;

public class LowTask21 {

    boolean x = false;
    boolean y = true;
    boolean z = false;

    public boolean booleanFunction(int number) {

        if (number == 1) return x && !(z || y) || !z;
        if (number == 2) return !x || x && (y || z);
        if (number == 3) return (x || y && !z) && z;

        return false;
    }
}
