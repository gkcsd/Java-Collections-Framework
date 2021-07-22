package string;


//Because of this String class is immutable
public class StringClassSix {
    public static void main(String[] args) {
        String s1 = "Ganesh";
        String s2 = s1;

        s1 = s1 + "Kale";

        System.out.println(s1);

        System.out.println(s1 == s2);
    }
}
