package PacticeProblems;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AddTwoNo{
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int T = fs.nextInt();

        for(int i = 0; i < T; i++) {
            int A = fs.nextInt();
            int B = fs.nextInt();
            System.out.println(A+B);
        }
    }

    static class FastScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        public String next() {
            while(!st.hasMoreElements())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int[] readArray(int n) {
            int[] a=new int[n];
            for(int i=0; i<n; ++i) a[i]=nextInt();
            return a;
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}


