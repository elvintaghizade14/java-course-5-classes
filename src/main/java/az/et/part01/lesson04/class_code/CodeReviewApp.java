package az.et.part01.lesson04.class_code;

public class CodeReviewApp {
    public static void main(String[] args) {
        int n = calcPow(2, 3);
        System.out.println(n);
    }

    private static int calcPow(final int base, final int pow) {
        return (int) Math.pow(base, pow);
    }
}
