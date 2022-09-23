package ru.vsu.naumov;

import java.util.Scanner;

public class Task1_17 {

    public static double AreaTriangles(double r1){
        return (((Math.PI * Math.pow(r1,2)) / 8) * 3); // площадь закрашенных треугольников
    }

    public static double AreaAngles(double R2){
        return (((4 * Math.pow(R2,2)) - (Math.PI * Math.pow(R2,2))) / 2); // площадь закрашенных углов
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите радиус малой окружности: ");
        double r1 = scanner.nextDouble();

        System.out.print("Введите радиус большей окружности: ");
        double R2 = scanner.nextDouble();

        double AreaPainted = AreaTriangles(r1) + AreaAngles(R2);
        System.out.print("Площадь закрашенного участка = "+ AreaPainted);
    }
}

