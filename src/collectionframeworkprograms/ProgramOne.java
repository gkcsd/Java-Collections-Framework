package collectionframeworkprograms;

class Test{
    Object x;
    Object y;
}

public class ProgramOne {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.x = 12;
        t1.y = "Ganesh";
        String str = (String) t1.x;
    }
}
//This program compiles fine but it will show errors at runtime
//Create ClassCastException
