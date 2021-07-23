package array;

import java.util.Arrays;

public class ArrayCompareMethodFour {
    public static void main(String[] args) {
       String a[] = {"GANESH", "KALE"};
       String b[] = {"ganesh", "ide"};

       if(Arrays.compare(a,b, String::compareToIgnoreCase)==0) {
           System.out.println("YES");
       }else {
           System.out.println("NO");
       }
    }
}
