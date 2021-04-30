package collectionframeworkprograms.wildcard;

import java.util.ArrayList;

class StudentThree {
    //Code
}

class EnggStudentThree extends StudentThree {
    //Code
}

public class TestFour {
    public static void main(String[] args) {
        ArrayList<? super StudentThree> al = new ArrayList<>();
        ArrayList<Object> al2 = new ArrayList<>();

        al = al2;
    }
}
//Now al can refer to an object of StudentThree class and object of classes above
//The Student class === It is also called lower bounding