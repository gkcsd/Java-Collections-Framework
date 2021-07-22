package comparatorandcomparable;

import java.util.Arrays;

public class ComparatorInterfaceUsingMethodReference {
    public static void main(String[] args) {
        String arr[] = { "Ganesh", "Kale", "ganesh"};

        Arrays.sort(arr, String::compareToIgnoreCase);

        for(String i: arr) {
            System.out.print(i + " ");
        }
    }
}
