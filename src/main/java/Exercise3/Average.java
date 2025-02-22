package Exercise3;

import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List < Integer > nums = Arrays.asList(2, 4, 6, 7, 10, 18, 36);
        System.out.println("List of numbers: " + nums);

        double average = nums.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println("Average value of the said numbers: " + average);
    }
}