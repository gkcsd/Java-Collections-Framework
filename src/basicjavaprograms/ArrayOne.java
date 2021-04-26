package basicjavaprograms;


class PointOne{
    int x,y;
    PointOne(int x, int y) {
        this.x = x;
        this.y = y;
        }
}

public class ArrayOne {
    public static void main(String[] args) {
        PointOne[] a = {new PointOne(10,20),
                new PointOne(30,40),
                new PointOne(50,60)
                };
    for (int i = 0; i < a.length; i++) {
        System.out.println(a[i]);
    }

    }
}
