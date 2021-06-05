package deque;

import java.util.ArrayDeque;
import java.util.Deque;

class MyDS {
    Deque<Integer> ad ;

    MyDS() {
        ad = new ArrayDeque<>();
    }
    void insertMin(int x) {
        ad.offerFirst(x);
    }
    void insertMax(int x) {
        ad.offerLast(x);
    }
    int getMin() {
        return ad.peekFirst();
    }
    int getMax() {
        return ad.peekLast();
    }
    int extractMin() {
        return ad.pollFirst();
    }
    int extractMax() {
        return ad.pollLast();
    }
}

public class CreateFunctionOfMinMax {
    public static void main(String[] args) {
        MyDS md = new MyDS();

        md.insertMin(5);
        md.insertMax(15);

        System.out.println(md.getMin());
        System.out.println(md.getMax());

        System.out.println(md.extractMin());
        System.out.println(md.extractMax());
    }
}
