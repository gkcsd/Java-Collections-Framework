package javalambda;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceUsingStaticMethod {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(10,520,620,48,50);

        al.forEach(MethodReferenceUsingStaticMethod::printSquare);
    }
    static void printSquare(Integer x) {
        System.out.println(x*x);
    }
}
