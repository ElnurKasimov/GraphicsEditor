package GraphicsEditor;

public class Oval extends AnglelessShape implements Drawable, Removable, Fillable {
    private final int semiMajorAxis;
    private final int semiMinorAxis;

    public Oval(String name, int centreX, int centreY, int semiMajorAxis, int semiMinorAxis, int borderThick, String colour) {
        this.name = name;
        this.centreX = centreX;
        this.centreY = centreY;
        this.semiMajorAxis = semiMajorAxis;
        this.semiMinorAxis = semiMinorAxis;
        this.borderThick = borderThick;
        this.borderColor = colour;
    }

    @Override
    public void draw() {
        System.out.println("Нарисовали овал с центом с координатами (" +
                    centreX + ", " + centreY +
                    "), большой полуосью " + semiMajorAxis + ", малой полуосью " + semiMinorAxis
                    + ", толщиной " + borderThick + ", цветом " + borderColor);
    }

    @Override
    public void remove() {
        System.out.println("Удалили данный овал");
    }

    @Override
    public void fill(String bodyColor) {
        System.out.println("Заполнили данный овал  цветом " + bodyColor);
    }

    @Override
    public void unfill() {
        System.out.println("Опустошили наполненность данного овала");
    }

    @Override
    public String toString() {
        return "Эта фигура - Овал";
    }
}

