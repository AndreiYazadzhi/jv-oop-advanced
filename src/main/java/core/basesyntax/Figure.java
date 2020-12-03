package core.basesyntax;

public abstract class Figure implements GeometricObjectInfo {
    private Color color;
    private double area;

    protected Figure(double area,Color color) {
        this.color = color;
        this.area = area;
    }

    public Color getColor() {
        return color;
    }

    public double getArea() {
        return area;
    }

}
