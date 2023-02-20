package ru.gb.homework1.task3;

public abstract class GeometricFigure implements Filled {
    private String figureName;

    protected GeometricFigure(String figureName) {
        this.figureName = figureName;
        System.out.println("Создан"+this.figureName);
    }

    public String getNameFigure() {
        return this.figureName;
    }


}
