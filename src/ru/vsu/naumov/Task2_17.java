package ru.vsu.naumov;

import java.util.Scanner;

public class Task2_17 {


    public void main(String[] args) {

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


    private record Triangle(double sideA, double sideB, double sideC) {
            private Triangle(double sideA, double sideB, double sideC) {

                this.sideA = sideA;
                this.sideB = sideB;
                this.sideC = sideC;

                if (checkPossibilityExist()) {
                    throw new IllegalArgumentException("Треугольник не может существовать");
                }

            }

            boolean checkPossibilityExist() {
                return (sideA >= sideB + sideC || sideB >= sideA + sideC || sideC >= sideA + sideB);

            }


        }


}
