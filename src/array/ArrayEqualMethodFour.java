package array;

import java.util.Arrays;

public class ArrayEqualMethodFour {
    public static void main(String[] args) {
        String a[] = {"GANESH", "KALE"};
        String b[] = {"Ganesh", "Kale"};

        if(Arrays.equals(a,b, String::compareToIgnoreCase)) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
