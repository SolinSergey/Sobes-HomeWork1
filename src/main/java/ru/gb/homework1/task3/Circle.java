package ru.gb.homework1.task3;

public class Circle extends GeometricFigure{

    private int radius;

    public Circle() {
        this(10);
    }

    public Circle(int radius) {
        super("Круг");
        this.radius = radius;
    }

    @Override
    public void fill() {
        System.out.println("Закрасили в полосочку");
    }

    public Circle setRadius(int radius) {
        this.radius = radius;
        return this;
    }

    public int getRadius() {
        return radius;
    }
}
