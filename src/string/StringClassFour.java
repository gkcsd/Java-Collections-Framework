package string;

public class StringClassFour {
    public static void main(String[] args) {
        String s1 = "Ganesh";
        String s2 = "Anu";

        int res = s1.compareTo(s2);

        if(res == 0) {
            System.out.println("Same");
        }else if(res > 0) {
            System.out.println("s1 Greater");
        }else if(res < 0) {
            System.out.println("s1 is Smaller");
        }
    }
}
