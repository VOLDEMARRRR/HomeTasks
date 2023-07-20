package org.example;

import org.example.paragraph1.HighTask11;
import org.example.paragraph1.HighTask12;
import org.example.paragraph1.LowTask11;
import org.example.paragraph1.LowTask12;
import org.example.paragraph1.MiddleTask11;
import org.example.paragraph1.MiddleTask12;
import org.example.paragraph2.HighTask21;
import org.example.paragraph2.HighTask22;
import org.example.paragraph2.HighTask23;
import org.example.paragraph2.LowTask21;
import org.example.paragraph2.LowTask22;
import org.example.paragraph2.LowTask23;
import org.example.paragraph2.MiddleTask21;
import org.example.paragraph2.MiddleTask22;
import org.example.paragraph2.MiddleTask23;

public class Main {

    public static void main(String[] args) {
        HighTask21 highTask21 = new HighTask21();
        System.out.println("Hello world!");
        System.out.println(highTask21.isPointInSector(0.99, 0));
    }
}