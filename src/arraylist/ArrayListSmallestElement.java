package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSmallestElement {
    static List<Integer> getSmallElement(int arr[], int k) {
        List<Integer> li = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < k) {
                li.add(arr[i]);
            }
        }
        return li;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,5,3,6,78,110,50,30,60,70,85,65};

        List<Integer> al = getSmallElement(arr,30);

        for(Integer x: al) {
            System.out.println(x);
        }
    }
}
