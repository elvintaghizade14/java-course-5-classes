package az.et.part01.lesson01.class_code;

import java.util.ArrayList;
import java.util.List;

public class ArrayApp {
    public static void main(String[] args) {
        int[] ints = new int[5];
        System.out.println(ints.length);
//        System.out.println(ints[5]);

        Object[] objects = new Object[5];
        objects[0] = 1;
        objects[1] = 'a';

        List list = new ArrayList();
        list.add(1);
        list.add("a");
        System.out.println(list.toString());

        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
    }
}
