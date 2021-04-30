package collectionframeworkprograms;

class TestFour <T> {
    T x;
    static int count;

    TestFour() {
        count++;
    }
}

public class ProgramFour {
    public static void main(String[] args) {
        TestFour<Integer> t1 = new TestFour<>();
        TestFour<String> t2 = new TestFour<>();
        System.out.println(TestFour.count);
    }
}
