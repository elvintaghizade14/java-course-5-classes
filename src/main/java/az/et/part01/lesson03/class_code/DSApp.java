package az.et.part01.lesson03.class_code;

public class DSApp {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);

        int a = 1;
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);

        int[] arr = {1, 2, 3, 4, 5};
        char[] arr2 = {'a', 'b', 'c', 'd', 'e'};
        String str = "abcde";

        // 1. input

        // 2. process

        // 3. output

        Human john1 = new Human("John1", 1);
        Human john2 = new Human("John2", 2);
        Human john3 = new Human("John3", 3);

        Human[] humans = {john1, john2, john3};
        for (int i = 0; i < humans.length; i++) {
            System.out.println(humans[i]);
        }
    }
}
