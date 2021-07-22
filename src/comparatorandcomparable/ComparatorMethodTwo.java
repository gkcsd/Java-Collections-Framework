package comparatorandcomparable;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorMethodTwo {
    public static void main(String[] args) {
        String s[] = {"Sumona", "Ajay", "Priya"};

        Arrays.sort(s, Comparator.reverseOrder());

        System.out.println(Arrays.toString(s));
    }
}
