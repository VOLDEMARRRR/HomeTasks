package org.example.paragraph2;

public class LowTask22 {

    public void salarySupplement(double salary, double exp) {
        if (salary < 0) {
            System.out.println("Зарплата не может быть отрицательнй");
            return;
        }

        if (exp < 0) {
            System.out.println("Опыт не может быть отрицательнй");
            return;
        }

        double allowance = 0;
        if (exp >= 2 && exp < 5) allowance = salary * 0.02;
        if (exp >= 5 && exp < 10) allowance = salary * 0.05;
        if (exp >= 10) {
            System.out.println("Вы здесь биг босс ваша зарплата мильен долларов");
            return;
        }
        double pay = salary + allowance;

        System.out.println("Надбавка состовляет " + allowance + " рублей");
        System.out.println("Выплата состовляет " + pay + " рублей");

    }
}
