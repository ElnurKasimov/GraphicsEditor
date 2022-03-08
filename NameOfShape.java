package GraphicsEditor;

public class NameOfShape {
    private Shape shape;

    public NameOfShape(Shape shape) {
        this.shape = shape;
    }

    public String get(Shape shape) {
        return shape.name;
    }

    // можно вывести имя фигуры и не оспользую поле name
    // для этого надо применить нижеуказанный метод
    // однако вывод будет не таким красивым - в консоль будет выведено
    // The class of   Oval  is GraphicsEditor.Oval
    // правда для этого нужно будет немного переопределить метод toString чтобы он вывел корректное значение


    public void printClassName(Object obj) {
        System.out.println("The class of  " + obj +
                " is " + obj.getClass().getName());
    }

}
