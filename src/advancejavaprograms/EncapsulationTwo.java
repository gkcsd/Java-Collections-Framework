package advancejavaprograms;

class TestTwo {
    String name;
    private static float marks;

    public static float getMarks() {
        return marks;
    }
    public static void setMarks(float marks) {
        TestTwo.marks = marks;
    }
}

public class EncapsulationTwo {
    public static void main(String[] args) {
        TestTwo t2 = new TestTwo();
        t2.setMarks(89.25f);
        System.out.println(t2.getMarks());
    }
}
