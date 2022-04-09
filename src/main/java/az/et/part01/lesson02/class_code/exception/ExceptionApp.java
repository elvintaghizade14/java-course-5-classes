package az.et.part01.lesson02.class_code.exception;

import java.io.File;
import java.io.IOException;

public class ExceptionApp {
    public static void main(String[] args) {
        try {
            System.out.println("Try block");
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Catch block");
        } finally {
            System.out.println("Finally block");
        }

        try{
            new File("/home/user/file.txt").createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
