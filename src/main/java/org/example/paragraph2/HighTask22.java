package org.example.paragraph2;

public class HighTask22 {

    public void isNumberInNumeric(int number, int numeric) {

        if (numeric / 10 == 5 || numeric % 10 == 5) {
            System.out.println("В данное число входит цифра 5");
        } else {
            System.out.println("В данной число цифра 5 не входит");
        }

        if (numeric / 10 == number || numeric % 10 == number) {
            System.out.println("В данное число входит цифра " + number);
        } else {
            System.out.println("В данной число цифра " + number + " не входит");
        }

    }
}
