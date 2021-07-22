package string;

public class StringClassTwo {
    public static void main(String[] args) {
        String s1 = "Ganesh";
        String s2 = "Ganesh";

        if(s1 == s2) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

        String s3 = new String("Ganesh");

        if(s3 == s1) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
