package streams;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StreamSix {
    public static void main(String[] args) {
        String arr[] = {"abc", "cde", "acd", "aec", "xyz"};

        Arrays.stream(arr)
                .filter(x -> x.startsWith("a"))
                .filter(x -> x.endsWith("c"))
                .sorted()
                .forEach(System.out::println);
    }
}
