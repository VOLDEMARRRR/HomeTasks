package org.example.paragraph2;

public class HighTask23 {

    public void typeWind(String wind) {
        if (wind.equalsIgnoreCase("слабый")){
            System.out.println("От 1 до 4 м/c");
            return;
        }
        if (wind.equalsIgnoreCase("умеренный")) {
            System.out.println("От 5 до 10 м/c");
            return;
        }
        if (wind.equalsIgnoreCase("сильный")) {
            System.out.println("От 9 до 18 м/c");
            return;
        }
        if (wind.equalsIgnoreCase("ураганный")) {
            System.out.println("Больше 19 м/c");
            return;
        }

        System.out.println("Такой характеристики ветра не существует");
    }
}
