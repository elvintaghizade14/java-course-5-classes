package az.et.part01.lesson02.class_code.inheritance;

public class Square {
    private Color color;
    private double side;
    private double area;
    private double perimeter;

    public Square(Color color, double side) {
        this.color = color;
        this.side = side;
        this.area = side * side;
        this.perimeter = side * 4;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        this.area = side * side;
        this.perimeter = side * 4;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void draw() {
        System.out.println("Drawing a square...");
    }

    @Override
    public String toString() {
        return String.format("Square{color=%s, side=%s, area=%s, perimeter=%s}",
                color, side, area, perimeter);
    }
}
