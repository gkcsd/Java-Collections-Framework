package collectionframeworkprograms.iterationcollection;

import java.util.Arrays;
import java.util.List;

public class ForEachMethod {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(10,30,50,40,80);

        al.forEach(x -> System.out.println(x));
    }
}
