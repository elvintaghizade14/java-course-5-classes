package az.et.part01.lesson01.class_code;

public class ArrayExercisesApp {

    public static void main(String[] args) {
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 20);
            System.out.print(nums[i] + " ");
        }

        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (num < min) min = num;
            if (num > max) max = num;
        }
        System.out.println("\nmax is: " + max + ", min is: " + min);

        System.out.println("correctness");
        System.out.println("optimization");
        System.out.println("readability");
    }

}
