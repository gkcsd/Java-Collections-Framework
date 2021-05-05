package collectionframeworkprograms.iterationcollection;

import java.util.Arrays;
import java.util.List;

public class StreamOperation {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(10,20,30,7,3,5,89,54,12,82);

        al.stream().forEach(x -> System.out.print(x + " "));

        al.stream().filter(x -> x > 10)
                .filter(x -> x%2 == 0)
                .forEach(x -> System.out.println(x));
    }
}
