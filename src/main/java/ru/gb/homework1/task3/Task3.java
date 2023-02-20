package ru.gb.homework1.task3;

public class Task3 {
    public static void main(String[] args) {
        GeometricFigure[] geometricFigures = new GeometricFigure[3];
        geometricFigures[0]=new Circle();
        geometricFigures[1]=new Square();
        geometricFigures[2]=new Triangle();

        System.out.println("--------------------------------");

        for (GeometricFigure g:geometricFigures){
            System.out.println(g.getNameFigure());
            g.fill();
            System.out.println();
        }
    }
}
