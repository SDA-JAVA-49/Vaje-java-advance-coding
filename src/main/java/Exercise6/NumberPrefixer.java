package Exercise6;

import java.util.List;
import java.util.stream.Collectors;

public class NumberPrefixer {

    public String getString(List<Integer> list) {
        return list.stream()
                .map(i -> i % 2 == 0 ? "e" + i : "o" + i)
                .collect(Collectors.joining(","));
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 44);
        NumberPrefixer np = new NumberPrefixer();
        System.out.println(np.getString(numbers));
    }
}

