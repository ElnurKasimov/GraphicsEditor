package GraphicsEditor;

public class NameOfShape {
    private Shape shape;

    public NameOfShape(Shape shape) {
        this.shape = shape;
    }

    public String get(Shape shape) {
        return shape.name;
    }

}
