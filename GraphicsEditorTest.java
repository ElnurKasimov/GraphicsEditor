package GraphicsEditor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class GraphicsEditorTest {

    public static void main(String[] args) {
        ArrayList<Shape> face = new ArrayList<>();
        face.add(new Oval("Oval", 10, 170, 40, 20, 2, "black"));
        face.add(new Oval("Oval", 240, 170, 40, 20, 2, "grey"));
        face.add(new Circle("Circle", 90, 160, 20, 2, "blue"));
        face.add(new Circle("Circle", 170, 160, 20, 2, "light blue"));
        int[][] triangleVertexes = {{100, 130}, {160, 130}, {130, 180}};
        face.add(new Triangle("Triangle", triangleVertexes, 2, "green"));
        int[][] quadriVertexes = {{80, 60}, {190, 60}, {190, 100}, {80, 100}};
        face.add(new Quadrilateral("Quadrilateral", quadriVertexes, 2, "red"));
        int[][] polygonVertexes = {{80, 0}, {170, 0}, {220, 100}, {220, 190}, {180, 230}, {70, 230}, {30, 190}, {30, 100}};
        face.add(new Polygon("Polygon", polygonVertexes, 8, 2, "pink"));
        //for (int i = 0; i < face.size(); i++) { face.get(i).draw();}
        Stream<Shape> streamShape = face.stream();
        streamShape.forEach( Shape :: draw);
        for (Shape shape : face) {
            NameOfShape nameOfShape = new NameOfShape(shape);
            System.out.println("Вызываемая фигура - " + nameOfShape.get(shape));
            // nameOfShape.printClassName(shape);
        }
    }
}
        // в результате выполнения этого кода (если прорисовать все методы рисованием графики,
        // то получиться картинка, которую я вложил в репозиторий
        // я уже не стал заморачиваться с методами fill и unfill

        // используя метод changeLine(), описанном в классе Line можно изменять конфигурацию фигур
        // перемещая один или другой конец отрезка и, соответственно, корякая фигуру
        // а если использовать этод метод в циклах, то можно добиться и анимационных эффектов.

// чтобы нарисовать все одним махом я для  всех фигур применил  метод draw, для этого переменные делал Shape,
// а сами объекты - нужных мне классов. но для применения к ним метода draw  IDEA захотела, чтобы класс Shape тоже имплементировал
// интерфейс Drawable. Хотя изначально у меня этого не было (только в самых молодых потомках была имплементация)
// Она этого захотела потому что я изначально  создал лист из объектов Shape.
// Вопрос 1. Ну и что. Метод применяется к типу объекта, а не к типу какой переменной он объявлен.
// Вопрос 2. Как мне закастить в ячейки листа экземпляры именно тех классов, которые
//                   я создавал, ведь они уже реализуют этот интерфейс?
// Вопрос 3. Я реализовал этот интерфейс в классе Shape, но не реализовывал в его потомках AnglelessShape и AngleShape.
//                   А их потомки ( Circle, Polygon etc.) его реализовывают.
//                   Если я добавляю описание имплементации в промежуточные классы или убираю из самых молодых, то
//                   IDEA матюкается. Как так и почему?