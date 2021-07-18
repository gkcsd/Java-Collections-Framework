package PacticeProblems;

//Author- GKCSD

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class GrossSalary {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int T = fs.nextInt();
        while (T-- > 0) {
            int n=fs.nextInt();
            if(n<1500) {
                double g=n*0.1;
                double k=n*0.9;
                System.out.println(n+g+k);
            }else {
                double c=n*0.98;
                System.out.println((n+500+c));
            }
        }
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        public String next() {
            while (!st.hasMoreElements())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; ++i) a[i] = nextInt();
            return a;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        float nextFloat() {
            return Float.parseFloat(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
