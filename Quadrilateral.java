package GraphicsEditor;

public class Quadrilateral extends AngleShape implements Drawable, Removable, Fillable {
    private Line[] sides = new Line[4];

    public Quadrilateral(int[][] vertexes, int borderThick, String borderColor) {
        if (vertexes.length != 4) { throw new MyIllegalArgumentException("Число вершин для треугольника не соответствует 4-м");}
        this.vertexes = vertexes;
        this.borderThick = borderThick;
        this.borderColor = borderColor;
        for (int i = 0; i < 3; i++) {
            sides[i] = new Line( vertexes[i][0], vertexes[i][1], vertexes[i+1][0], vertexes[i+1][1], this.borderColor);
        }
        sides[3] = new Line( vertexes[3][0], vertexes[3][1], vertexes[0][0], vertexes[0][1], this.borderColor);
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

