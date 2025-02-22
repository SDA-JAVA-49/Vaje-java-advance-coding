package Exercise5;

import java.util.List;
import java.util.stream.Collectors;

class StreamFilterExample {
    public static List<String> filterThreeLetterA(List<String> strings) {
        return strings.stream()
                .filter(s -> s.matches("a..")) // Përdor regex për të filtruar fjalët
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> words = List.of("ant", "apple", "bat", "ace", "arc", "arm", "ask", "cat");
        System.out.println(filterThreeLetterA(words)); // [ant, ace, arc, arm, ask]
    }
}
