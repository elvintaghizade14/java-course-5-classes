package az.et.part01.lesson01.class_code;

import java.util.Scanner;

public class EndOfLineApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            int a = in.nextInt();
            System.out.println("a is: " + a);
        }
    }
}
