package GraphicsEditor;

abstract public class Shape implements Drawable, Removable, Fillable {
    protected int borderThick;
    protected String borderColor;

    public int getBorderThick() {
        return borderThick;
    }

    public String getBorderColor() {
        return borderColor;
    }

    abstract public String toString();

}
