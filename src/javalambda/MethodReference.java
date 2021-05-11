package javalambda;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(10,20,15,16);

        al.forEach(System.out::println);
    }
}
