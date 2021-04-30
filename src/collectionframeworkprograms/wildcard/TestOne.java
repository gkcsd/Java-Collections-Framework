package collectionframeworkprograms.wildcard;

import java.util.ArrayList;

class Student {
    //Code
}
class EnggStudent extends Student {
    //Code
}

public class TestOne {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        ArrayList<EnggStudent> al2 = new ArrayList<>();

        //al = al2;
    }
}
//We cant create arraylist of EnggStudent to arraylist of Student we get compiler error
