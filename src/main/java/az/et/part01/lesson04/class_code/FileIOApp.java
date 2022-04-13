package az.et.part01.lesson04.class_code;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;

public class FileIOApp {
    public static final String BASE_PATH =
            "/home/elvin/IdeaProjects/java-courses/java-course-5-classes/src/main/java/az/et/part01/lesson04/class_code/files/";

    public static void main(String[] args) {

        try {
            File file = new File(BASE_PATH.concat("a.txt"));
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hello World!");
            bw.close();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            File file = new File(BASE_PATH.concat("a.txt"));
            FileOutputStream fos = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            bos.write("Hello World!".getBytes());
            bos.close();
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File file = new File(BASE_PATH.concat("a.txt"));
        try (FileInputStream fis = new FileInputStream(file);
             BufferedInputStream bis = new BufferedInputStream(fis)) {
            System.out.println(Arrays.toString(bis.readAllBytes()));
            System.out.println((int) 'H');
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
