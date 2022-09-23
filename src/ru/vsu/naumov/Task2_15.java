package ru.vsu.naumov;

import java.util.Scanner;

public class Task2_15 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Длина стороны A  = ");
        double sideA = scanner.nextDouble();
        System.out.print("Длина стороны  B  = ");
        double sideB = scanner.nextDouble();
        System.out.print("Длина стороны  C  = ");
        double sideC = scanner.nextDouble();
        Triangle triangle = new Triangle(sideA, sideB, sideC);
        System.out.print("Радиус R  = ");
        double radius = scanner.nextDouble();


    }


}
    // сам треугольник
class Triangle {
    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(double sideA, double sideB, double sideC) {

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

        // пишет что треугольник существовать не может при таких значениях

        if (checkPossibilityExist()) {
            throw new IllegalArgumentException("Треугольник не может существовать");
        }

    }


    // считает полупериметр

    public double calculateHalfPerimeter() {
        return (sideA + sideB + sideC) / 2;
    }

    // проверяет существование треугольника
    private boolean checkPossibilityExist() {
        return (sideA >= sideB + sideC || sideB >= sideA + sideC || sideC >= sideA + sideB);

    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }


}
