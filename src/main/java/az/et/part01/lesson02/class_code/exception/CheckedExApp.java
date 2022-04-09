package az.et.part01.lesson02.class_code.exception;

public class CheckedExApp {
    public static void main(String[] args) throws MyCheckedException {
        draw();
    }

    private static void draw() throws MyCheckedException {
        throw new MyCheckedException("Drawing failed");
//        System.out.println("Drawing...");
    }


}
