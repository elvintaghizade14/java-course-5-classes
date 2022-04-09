package az.et.part01.lesson02.class_code;

import java.util.Arrays;

public class PassingReferencesApp {

    public static void main(String[] args) {
        int[] initial = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(initial));
        change(initial);
        System.out.println(Arrays.toString(initial));

    }

    private static void change(int[] initial) {
        initial[0] = 10;
    }

}
