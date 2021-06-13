package maps;

import java.util.TreeMap;

public class ProgramOne {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>();
        tm.put(100,"Courses");
        tm.put(101,"Work");
        tm.put(102,"Rest");

        System.out.println(tm);
    }
}
