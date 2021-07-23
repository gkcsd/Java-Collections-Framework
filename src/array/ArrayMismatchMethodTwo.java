package array;

import java.util.Arrays;

public class ArrayMismatchMethodTwo {
    public static void main(String[] args) {
       String a[] = {"Ganesh", "KALE"};
       String b[] = {"ganesh", "Course"};

        System.out.println(Arrays.mismatch(a,b, String::compareToIgnoreCase));
    }
}
