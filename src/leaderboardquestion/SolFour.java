package leaderboardquestion;

public class SolFour {
    public static void main(String[] args) {
        System.out.println("ans = " + test(4));
    }
    public static int test(int k) {
        int x = 1;
        switch (k) {
            case 1: x++;
            case 2: x++;
            case 3: x++;
            case 4: x++;
            case 5: x++;
            default: x++;
        }
        return x + k;
    }
}
