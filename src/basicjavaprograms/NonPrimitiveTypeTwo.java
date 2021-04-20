package basicjavaprograms;

class PointTwo {
    int x;
    int y;
}

public class NonPrimitiveTypeTwo {
    public static void main(String[] args) {
        PointTwo p = new PointTwo();
        p.x = 10;
        p.y = 20;
        PointTwo p2 = p;
        p2.x = 30;
        System.out.println(p.x);
        System.out.println(p2.x);
    }
}
