package az.et.part01.lesson01;

public class ArrayAndMethodApp {
    public static void main(String[] args) {
        double calc = calc(2, 3);
        System.out.println(calc);
    }

    public static double calc(int base, int power) {
        double pow = Math.pow(base, power);
        System.out.println(pow);
        return pow;
    }
}
