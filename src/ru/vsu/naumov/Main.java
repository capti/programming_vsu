package ru.vsu.cs.naumov;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static final VerticalParabola P1 = new VerticalParabola(6, -6, -1);
    public static final Line L1 = new Line (3.1, 11, 1);


    public static SimpleColor getColor(double x, double y){
        if(!) {
            return SimpleColor.ORANGE;
        }
        return SimpleColor.BLUE;
    }



    public static void printColorForPoint(double x, double y) {
        System.out.printf("(%.3f, %.3f) -> %s%n", x, y, getColor(x, y));
    }




    public static void tests() {
        printColorForPoint(3, 2);
        printColorForPoint(0, 5);
        printColorForPoint(-8, -3);
        printColorForPoint(3, -3);
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        tests();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x, y:");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        printColorForPoint(x, y);
    }
}
