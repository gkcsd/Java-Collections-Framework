package comparatorandcomparable;

import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;

class Point {
    int x,y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + " " + y + ")";
    }
}

class MyCmp implements Comparator<Point> {
    public int compare(Point p1, Point p2) {
        return p1.x - p2.x;
    }
}

public class ComparatorInterfaceOne {
    public static void main(String[] args) {
        Point arr[] = {
                new Point(10,20),
                new Point(5,45),
                new Point(25,35)
        };

        Arrays.sort(arr, new MyCmp());

        System.out.println(Arrays.toString(arr));
    }
}
