package collectionframeworkprograms.wildcard;

import java.util.ArrayList;

class StudentTwo {
    //Code
}

class EnggStudentTwo extends StudentTwo {
    //Code
}

public class TestThree {
    public static void main(String[] args) {
        ArrayList<? extends StudentTwo> al = new ArrayList<>();
        ArrayList<EnggStudentTwo> al2 = new ArrayList<>();

        al = al2;
    }
}
//It compiles and run fine because we used wild card special character with bound and
//Its added and refer only studentTwo and its descendants of StudentTwo