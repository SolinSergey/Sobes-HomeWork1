package ru.gb.homework1.task3;

public class Triangle extends GeometricFigure{

    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle() {
        this(10,20,30);
    }

    public Triangle(int sideA, int sideB, int sideC) {
        super("Треугольник");
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public void fill() {
        System.out.println("Закрасили пунктирной заливкой золотого цвета");
    }

    public int getSideA() {
        return sideA;
    }

    public Triangle setSideA(int sideA) {
        this.sideA = sideA;
        return this;
    }

    public int getSideB() {
        return sideB;
    }

    public Triangle setSideB(int sideB) {
        this.sideB = sideB;
        return this;
    }

    public int getSideC() {
        return sideC;
    }

    public Triangle setSideC(int sideC) {
        this.sideC = sideC;
        return this;
    }
}
