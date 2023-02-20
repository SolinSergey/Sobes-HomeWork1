package ru.gb.homework1.task2.optimized;

public class Lorry extends Car implements Moveable,Openable,Stopable{
    @Override
    public void move() {
        System.out.println("Car is open");
    }

    @Override
    public void open() {
        System.out.println("Car is moving");
    }

    @Override
    public void stop() {
        System.out.println("Car is open");
    }
}
