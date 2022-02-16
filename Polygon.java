package GraphicsEditor;

public class Polygon extends AngleShape implements Drawable, Removable, Fillable {
    private int dimension;
    private Line[] sides = new Line[4];

    public Polygon(int[][] vertexes, int dimension, int borderThick, String borderColor) {
        if (vertexes.length != dimension) { throw new MyIllegalArgumentException("Число " +
                "вершин для этого много-угольника не сответствует размерности массива вершин");}
        this.dimension = dimension;
        this.vertexes = vertexes;
        this.borderThick = borderThick;
        this.borderColor = borderColor;
        for (int i = 0; i < dimension-1; i++) {
            sides[i] = new Line( vertexes[0][0], vertexes[0][1], vertexes[i+1][0], vertexes[i+1][1], this.borderColor);
        }
        sides[dimension-1] = new Line( vertexes[dimension-1][0], vertexes[dimension-1][1], vertexes[0][0], vertexes[0][1], this.borderColor);
        /*
        проверка на возможность создать фигуру
        если линии пересекаются, то выбросить
        исключение MyNoSuchElementException, которое нследуется от  NoSuchElementException
         */
    }

    class MyIllegalArgumentException extends IllegalArgumentException {
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
}

