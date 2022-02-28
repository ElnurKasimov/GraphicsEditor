package GraphicsEditor;

public class Circle  extends AnglelessShape implements Drawable, Removable, Fillable {
    private final int radius;

    public Circle(String name, int centreX, int centreY, int radius, int borderThick, String borderColor) {
        this.name = name;
        this.centreX = centreX;
        this.centreY = centreY;
        this.radius = radius;
        this.borderThick = borderThick;
        this.borderColor = borderColor;
    }

    @Override
    public void draw() {
        System.out.println("Нарисовали окружность с центом с координатами (" +
                    centreX + ", " + centreY +
                    "), радиусом " + radius + ", толщиной " + borderThick + ", цветом " + borderColor);
    }

    @Override

    public void remove() {
        System.out.println("Удалили данную окружность");
    }

    @Override
    public void fill(String bodyColor) {
        System.out.println("Заполнили данную окружность  цветом " + bodyColor);
    }
    @Override
    public void unfill() {
        System.out.println("Опустошили наполненность данной окружности");
    }
    @Override
    public String toString() {
        return "Эта фигура - Круг";
    }
}

