package ru.gb.homework1.task2.optimized;

import ru.gb.homework1.task2.witherrors.Task2WithErrors;

class LightWeightCar extends Car implements Moveable,Openable,Stopable {
    @Override
    public void open() {
        System.out.println("Car is open");
    }
    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public void stop() {
        System.out.println("Car is open");
    }
}