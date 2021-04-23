import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PairIntegersProblem {
    public static void main(String[] gkcsd) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 5; i++) {
            int x = Integer.parseInt(br.readLine());
            int y = Integer.parseInt(br.readLine());

            if (y == 0) continue;

            System.out.println(x/y);
        }
    }
}
