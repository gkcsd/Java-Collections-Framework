public class ContinueKeywordTwo {
    public static void main(String[] gkcsd) {
        int i = 0;
        while(i < 3) {
            i++;
            System.out.println("Before " + i);
            if(i == 2) {
                continue;
            }
            System.out.println("After " + i);
        }
    }
}
