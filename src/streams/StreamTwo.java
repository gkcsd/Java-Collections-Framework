package streams;

import java.util.Arrays;

public class StreamTwo {
    public static void main(String[] args) {
        int arr[] = { 10,0,56,8,15,63,75};

        int sum = Arrays.stream(arr)
                .sum();
        System.out.println(sum);
    }
}
