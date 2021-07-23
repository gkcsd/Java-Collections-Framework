package array;


import java.util.Arrays;
import java.util.Comparator;

class Topic {
    int x, y;
    Topic(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class MyCmp implements Comparator<Point> {
    public int compare(Point p1, Point p2) {
        return p1.x - p2.x;
    }
}

public class ArrayBinarySearchOnComparatorInterface {
    public static void main(String[] args) {
        Point arr[] = {
                new Point(10, 20),
                new Point(20, 15),
                new Point(25, 5),
                new Point(40, 100)
        };

        Point p = new Point(25,5);

        System.out.println(Arrays.binarySearch(arr,p, new MyCmp()));
    }
}
