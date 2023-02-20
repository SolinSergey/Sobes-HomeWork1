package ru.gb.homework1.task3;

public class Square extends GeometricFigure{

    private int side;
    public Square() {
        this(10);
    }

    public Square(int side) {
        super("Квадрат");
        this.side = side;
    }

    @Override
    public void fill() {
        System.out.println("Закрасили сплошной заливкой");
    }

    public int getSide() {
        return side;
    }

    public Square setSide(int side) {
        this.side = side;
        return this;
    }
}
