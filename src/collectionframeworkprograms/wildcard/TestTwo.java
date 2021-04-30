package collectionframeworkprograms.wildcard;

import java.util.ArrayList;

class StudentOne {
    //Code
}

class EnggStudentOne extends StudentOne {
    //Code
}

public class TestTwo {
    public static void main(String[] args) {
        ArrayList<?> al = new ArrayList<>();
        ArrayList<EnggStudentOne> al2 = new ArrayList<>();

        al = al2;
    }
}
//Now it compiles fine and run because we used special wild card char here it means
//ArrayList of unknown type