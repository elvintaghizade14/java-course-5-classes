package az.et.part01.lesson02.class_code;

public class PassingPrimitivesApp {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        sum(a, b);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    private static void sum(int a, int b) {
        a++;
        b++;
    }
}
