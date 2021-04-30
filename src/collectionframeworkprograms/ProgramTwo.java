package collectionframeworkprograms;

class TestTwo<T, S> {
    T x;
    String y;
}

public class ProgramTwo {
    public static void main(String[] args) {
        TestTwo<Integer, String> t2 = new TestTwo<>();
        t2.x = 12;
        t2.y = "Ganesh";
       // String str = (String) t2.x;
    }
}
//It shows error at compile time and its more secure and type safe using
//generics
