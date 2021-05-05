package collectionframeworkprograms.iterationcollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachLoop {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(10,20,30,40,80,40,60,5);

        for(Integer x : al) {
            System.out.println(x);
        }
    }
}
