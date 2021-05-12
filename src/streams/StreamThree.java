package streams;

import java.util.Arrays;

public class StreamThree {
    public static void main(String[] args) {
        int arr[] = {10,20,30};
        int max = Arrays.stream(arr)
                .max()
                .getAsInt();
        System.out.println(max);
    }
}
