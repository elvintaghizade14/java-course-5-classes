package az.et.part01.lesson01;

public class SumApp {
    public static void main(String[] args) {
        //1...1000 - sum
        //1...1000 - prod
        long started = System.currentTimeMillis();
        int sum = 0;
        for (int i = 1; i <= 1000000; i++) {
            sum += i;
        }
        long finished = System.currentTimeMillis() - started;

        System.out.println("Sum: " + (1+1000)*1000/2);

        System.out.println("1...1000 sum: " + sum);
        System.out.println(finished + " milliseconds");
    }
}
