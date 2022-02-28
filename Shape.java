package GraphicsEditor;

abstract public class Shape implements Drawable, Removable, Fillable {
    protected String name;
    protected int borderThick;
    protected String borderColor;

    public String getName() {
        return name;
    }

    public int getBorderThick() {
        return borderThick;
    }

    public String getBorderColor() {
        return borderColor;
    }

    abstract public String toString();

}
