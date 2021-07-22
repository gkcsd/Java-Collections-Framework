package comparatorandcomparable;

import java.util.Arrays;
import java.util.Comparator;

class Student {
    int rollNo; String name;

    Student(String name, int rollNo) {
        this.rollNo = rollNo;
        this.name = name;
    }
    String getName() {
        return name;
    }
    int getRollNo() {
        return rollNo;
    }
    public String toString() {
        return "(" + name + " " + rollNo + ")";
    }
}

public class ComparatorMethodThree {
    public static void main(String[] args) {
        Student arr[] = {
                new Student("abc", 120),
                new Student("xyz", 110),
                new Student("abc", 101),
        };

        Arrays.sort(arr, Comparator.comparing(Student::getName)
            .thenComparing(Student::getRollNo)
        );

        System.out.println(Arrays.toString(arr));


    }
}
