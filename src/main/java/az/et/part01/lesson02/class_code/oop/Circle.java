package az.et.part01.lesson02.class_code.oop;

public class Circle {
    private double radius;
    private double length;

    public Circle(double radius) {
        this.radius = radius;
        this.length = 2 * Math.PI * radius;
    }

    public double getRadius() {
        return  radius;
    }

    public double getLength() {
        return length;
    }

}
