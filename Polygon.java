package GraphicsEditor;

import java.util.Arrays;

public class Polygon extends AngleShape implements Drawable, Removable, Fillable {
    private int dimension;
    private final Line[] sides = new Line[dimension];

    public Polygon(String name, int[][] vertexes, int dimension, int borderThick, String borderColor) {
        this.name = name;
        if (vertexes.length != dimension || vertexes.length == 0) { throw new MyIllegalArgumentException("Число " +
                "вершин для этого много-угольника не сответствует размерности массива вершин");}
        this.dimension = dimension;
        this.vertexes = vertexes;
        this.borderThick = borderThick;
        this.borderColor = borderColor;
        try {
            for (int i = 0; i < dimension - 1; i++) {
                sides[i] = new Line(vertexes[i][0], vertexes[i][1], vertexes[i + 1][0], vertexes[i + 1][1], this.borderColor);
                System.out.println(Arrays.toString(sides));
            }
            sides[dimension - 1] = new Line(vertexes[dimension - 1][0], vertexes[dimension - 1][1], vertexes[0][0], vertexes[0][1], this.borderColor);
    }
        catch (Exception e) {

            System.out.println("Я не понимаю, почему здесь выбрасывается исключение, \n" +
                    "а точно такой же код в классе Quadrilaterial работает великолепно");}
        /*
        проверка на возможность создать фигуру
        если линии пересекаются, то выбросить
        исключение MyNoSuchElementException, которое нследуется от  NoSuchElementException
         */
    }

   static class MyIllegalArgumentException extends IllegalArgumentException {
        public MyIllegalArgumentException() {}
        public MyIllegalArgumentException(String message) {
            super(message);
        }
    }

    @Override
    public void draw() {
        for ( Line line : sides )  {line.draw();}
    }

    @Override
    public void remove() {
        for ( Line line : sides )  {line.remove();}
    }

    @Override
    public void fill(String bodyColor) {
        System.out.println("Заполнили данный четыреугольник  цветом " + bodyColor);
    }

    @Override
    public void unfill() {
        System.out.println("Опустошили наполненность данного четырехугольника");
    }

    @Override
    public String toString() {
        return "Эта фигура - Многоугольник";
    }

}

