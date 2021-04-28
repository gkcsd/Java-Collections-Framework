package advancejavaprograms;

class TestEncapsulation {
    String name;
    private float CGPA;

    public float getCGPA() {
        return CGPA;
    }
    public void setCGPA(float CGPA) {
        this.CGPA = CGPA;
    }
}

public class EncapsulationOne {
    public static void main(String[] args) {
        TestEncapsulation te = new TestEncapsulation();
        te.setCGPA(96.45f);
        System.out.println(te.getCGPA());
    }
}
