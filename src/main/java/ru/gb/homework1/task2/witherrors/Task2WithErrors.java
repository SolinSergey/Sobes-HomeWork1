package ru.gb.homework1.task2.witherrors;

import ru.gb.homework1.task2.optimized.Engine;

public class Task2WithErrors {
    interface Moveable {
        void move();
    }
    interface Stopable {
        void stop();
    }
    abstract class Car {
        public Engine engine; //Не определен класс, модификатор лучше изменить на private
        private String color;
        private String name;
        protected void start() {
            System.out.println("Car starting");
        }
        abstract void open(); //Лучше выделить в отдельный интерфейс Openable
        public Engine getEngine() {
            return engine;
        }
        public void setEngine(Engine engine) {
            this.engine = engine;
        }
        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }
    class LightWeightCar extends Car implements Moveable { //Логично сделать еще и реализацию Openable,Stopable
        @Override
        void open() {
            System.out.println("Car is open");
        }
        @Override
        public void move() {
            System.out.println("Car is moving");
        }
    }
    class Lorry extends Car, Moveable, Stopable { //Правильно написать extend Car implements Moveable, Stopable

        public void move(){                         //не поставлена аннотация @Override
            System.out.println("Car is moving");
        }
        public void stop(){                         //не поставлена аннотация @Override
            System.out.println("Car is stop");
        }
        //Отсутствует реализация метода void open()
}
