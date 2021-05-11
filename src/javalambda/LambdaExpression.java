package javalambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExpression {

    static void printCond(Collection<Integer> c, Predicate<Integer> p) {
        for(Integer x: c) {
            if(p.test(x)) {
                System.out.println(x);
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,5,20,7,30));

        printCond(list, x -> x%2 == 0);
    }
}
