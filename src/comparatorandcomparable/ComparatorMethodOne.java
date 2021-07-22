package comparatorandcomparable;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorMethodOne {
    public static void main(String[] args) {
        String s[] = {"Sumona", null, "Ajay", null, "Priya"};

        Arrays.sort(s, Comparator.nullsFirst(Comparator.naturalOrder()));

        System.out.println(Arrays.toString(s));
    }
}
