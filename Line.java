package GraphicsEditor;

public class Line implements Drawable, Removable {
    private final int startX; 
    private final int endX;
    private final int startY;
    private final int endY;
    String color;

    public Line(int startX,  int startY, int endX, int endY, String color) {
        this.startX = startX;
        this.endX = endX;
        this.startY = startY;
        this.endY = endY;
        this.color = color;
    }

    public int getStartX() {
        return startX;
    }

    public int getEndX() {
        return endX;
    }

    public int getStartY() {
        return startY;
    }

    public int getEndY() {
        return endY;
    }

    public String getColour() {
        return color;
    }

    @Override
    public void draw () {
        System.out.println("Нарисовали линию из точки с координатами (" +
                                        startX + ", " + startY +
                                         ") в точку с координатами (" +
                                        endX + ", " + endY + "), цветом " + color);
    }
    @Override
    public void remove () {
        System.out.println("Удалили линию с координатами начала (" +
                startX + ", " + startY + ") и координатами конца (" +
                endX + ", " + endY + ")");
    }


    public Line changeLine(int newStartX,  int newStartY, int newEndX, int newEndY) {
        this.remove();
        return new Line(newStartX, newStartY, newEndX, newEndY, this.color);

    }
}
