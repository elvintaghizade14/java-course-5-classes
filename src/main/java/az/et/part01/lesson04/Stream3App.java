package az.et.part01.lesson04;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream3App {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(5);
        nums.add(5);
        nums.add(5);
        nums.add(5);

        IntSummaryStatistics intSummaryStatistics = nums.stream()
                .mapToInt(i -> i)
                .summaryStatistics();

//                .map(i -> i * 5)
//                .filter(i -> i % 2 == 0)
//                .sorted()
//                .collect(Collectors.toList());

        IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());


    }

}
