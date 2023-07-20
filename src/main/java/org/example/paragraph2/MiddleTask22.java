package org.example.paragraph2;

public class MiddleTask22 {

    public void isTriangleIsosceles (double a, double b, double c) {
        if (a >= (b + c) || b >= (a + c) || c >= (a + b) || a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Такого треугольника не существует");
            return;
        }

        if (a == b || b == c || a == c) {
            System.out.println("Это равнобедренный треугольник");
            return;
        }

        System.out.println("Это треугольник не равнобедренный");
    }
}
