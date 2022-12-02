package ru.vsu.cs.naumov;

public class VerticalParabola {
    public double a;
    public double b;
    public double c;

    public VerticalParabola(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isPointUnderOfParabola(double x, double y) {
        return x < c * ((Math.pow(y - a, 2))/8) + b;
    }

}
