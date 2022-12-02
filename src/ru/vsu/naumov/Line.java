package ru.vsu.cs.naumov;

public class Line {
    public double a;
    public double b;
    public double c;

    public Line(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public boolean isPoint(double x, double y) {
        return y > c * (x + a) * b;
    }
}
