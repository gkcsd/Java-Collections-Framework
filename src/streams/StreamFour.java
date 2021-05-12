package streams;

import java.util.Arrays;

public class StreamFour {
    public static void main(String[] args) {
        int arr[] = {10,20,30};

        double avg = Arrays.stream(arr)
                .average()
                .getAsDouble();
        System.out.println(avg);
    }
}
