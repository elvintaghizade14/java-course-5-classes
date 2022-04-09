package az.et.part01.lesson02.class_code.inheritance;

public class ShapeApp {
    public static void main(String[] args) {
        Shape round = new Round(Color.RED, 10.0d);
        Square square = new Square(Color.BLUE, 10.0d);

        System.out.println(round);
        System.out.println(square);

        boolean b = false;
        Boolean b1 = Boolean.FALSE;
        boolean b3 = Boolean.FALSE;


        draw(round);

    }

    private static void draw(Shape shape) {
        shape.draw();
    }
}
