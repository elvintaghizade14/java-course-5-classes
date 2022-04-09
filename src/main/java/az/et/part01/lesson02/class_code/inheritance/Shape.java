package az.et.part01.lesson02.class_code.inheritance;

public abstract class Shape {
    private Color color;
    private double area;
    private double perimeter;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract double setArea();

    public abstract double setPerimeter();

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public abstract void draw();
}
