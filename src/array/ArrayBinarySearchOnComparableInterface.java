package array;


import java.util.Arrays;

class Point implements Comparable<Point> {
    int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int compareTo(Point p) {
        return this.x - p.x;
    }
}

public class ArrayBinarySearchOnComparableInterface {
    public static void main(String[] args) {
        Point arr[] = {
                new Point(10, 20),
                new Point(20, 15),
                new Point(25, 5),
                new Point(40, 100)
        };

        Point p = new Point(25,5);

        System.out.println(Arrays.binarySearch(arr,p));
    }
}
