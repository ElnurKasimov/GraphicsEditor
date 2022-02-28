package GraphicsEditor;

public class Triangle extends AngleShape implements Drawable, Removable, Fillable {
    private final Line[] sides = new Line[3]; //  Вопрос 1. Почему во всех окончтельных класса IDEA рекомендует сделать все private поля final?

    public Triangle(String name, int[][] vertexes, int borderThick, String borderColor) {
        this.name = name;
        if (vertexes.length != 3) { throw new MyIllegalArgumentException("Число вершин для треугольника не соответствует 3-м");}
        this.vertexes = vertexes;
        this.borderThick = borderThick;
        this.borderColor = borderColor;
        sides[0] = new Line( vertexes[0][0], vertexes[0][1], vertexes[1][0], vertexes[1][1], this.borderColor); //  Вопрос 2. надо тут использовать this?
        sides[1] = new Line( vertexes[1][0], vertexes[1][1], vertexes[2][0], vertexes[2][1], this.borderColor);
        sides[2] = new Line( vertexes[2][0], vertexes[2][1], vertexes[0][0], vertexes[0][1], this.borderColor);
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
        sides[0].draw();
        sides[1].draw();
        sides[2].draw();

    }

    @Override
    public void remove() {
        sides[0].remove();
        sides[1].remove();
        sides[2].remove();
    }

    @Override
    public void fill(String bodyColor) {
        System.out.println("Заполнили данный треугольник  цветом " + bodyColor);
    }

    @Override
    public void unfill() {
        System.out.println("Опустошили наполненность данного треугольника");
    }

    @Override
    public String toString() {
        return "Эта фигура - Треугольник";
    }

}

