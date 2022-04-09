package az.et.part01.lesson02.class_code.inheritance;

public class Round extends Shape {
    private double radius;

    public Round(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double setArea() {
        return 0;
    }

    @Override
    public double setPerimeter() {
        return 0;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a round");
    }

    @Override
    public String toString() {
        return String.format("Round{color=%s, area=%s, radius=%s, parameter=%s}",
                this.getColor(), this.getArea(), radius, this.getPerimeter());
    }
}
