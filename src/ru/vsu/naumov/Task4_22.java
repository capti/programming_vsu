package ru.cs.vsu.naumov;

import java.util.Scanner;


public class Task4_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("Результат: " + calculate(N));
    }
    public static  double calculate(int N) {
        double result = 0;
        for (int i = 1, j = N; i <= N && j >= 1; i++, j--) {
            result += Math.pow(i, j);
        }
        return result;
    }
}
