package ru.cs.vsu.naumov;

import java.util.Scanner;


public class Task4_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = sc.nextInt();
        System.out.println("Результат: " + calculate(N));
    }
    //создаём j чтобы была как степень N и потом минусуем каждый раз как по условию
    //сравниваем i с N для того чтобы каждый раз число не было больше N и соблюдалось возрастание на единицу
    
    public static  double calculate(int N) {
        double result = 0;
        for (int i = 1, j = N; i <= N && j >= 1; i++, j--) {
            result = result + Math.pow(i, j);
        }
        return result;
    }
}
