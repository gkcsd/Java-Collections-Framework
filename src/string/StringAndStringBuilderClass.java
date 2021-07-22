package string;

public class StringAndStringBuilderClass {
    public static void main(String[] args) {

        String s1 = "Ganesh";
        String s2 = s1;

        s1 = s1 + "Kale";

        if(s1 == s2) {
            System.out.println("Same");
        }else {
            System.out.println("Not Same");
        }

        System.out.println();

        StringBuilder sb1 = new StringBuilder("Ganesh");
        StringBuilder sb2 = sb1;

        sb1 = sb1.append("Kale");

        if(sb1 == sb2) {
            System.out.println("Same");
        }else {
            System.out.println("Not Same");
        }
    }
}
