package comparatorandcomparable;

import java.util.Arrays;
import java.util.Comparator;

class PointOne {
    int x,y;
    PointOne(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + " " + y + ")";
    }
}

public class ComparatorInterfaceUsingLambdaExpression {
    public static void main(String[] args) {
        PointOne arr[] = {
                new PointOne(10,20),
                new PointOne(5,45),
                new PointOne(25,35)
        };

        Arrays.sort(arr, (p1,p2) -> (p1.x - p2.x));

        System.out.println(Arrays.toString(arr));
    }
}
