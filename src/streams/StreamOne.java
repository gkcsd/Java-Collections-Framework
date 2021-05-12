package streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class StreamOne {
    public static void main(String[] args){
        List<Integer> al = Arrays.asList(10,50,652,568,45,87,20,36,74,5,3,6,8);

        al.stream().filter(x -> x%2 == 0).filter(x -> x>20).forEach(System.out::println);
    }
}
