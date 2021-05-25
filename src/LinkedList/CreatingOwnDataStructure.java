package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

class MyDataStructure {
    LinkedList<Integer> list = new LinkedList<>();

    void add(int x) {
        list.add(x);
    }

    void removeAndPrint(int x) {
        Iterator<Integer> it = list.iterator();

        while(it.hasNext()) {
            Integer n = (Integer) it.next();

            if(n.equals(x)) {
                it.remove();
            }else{
                System.out.print(n + " ");
            }
        }
    }
}

public class CreatingOwnDataStructure {
    public static void main(String[] args) {
        MyDataStructure md = new MyDataStructure();
        md.add(10);
        md.add(20);
        md.add(10);

        md.removeAndPrint(10);
    }
}
