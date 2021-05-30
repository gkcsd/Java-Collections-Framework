package PacticeProblems;
//Author- GKCSD

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class LeadGame {
    public static void main(String[] args) throws IOException {
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        FastScanner fs = new FastScanner();
        int T = fs.nextInt();
        int val = 0;
        int win = -1;
        int p1 = 0;
        int p2 = 0;
        while (T-- > 0) {
            p1 += fs.nextInt();
            p2 += fs.nextInt();
            if(p1-p2>val) {
                val = p1-p2;
                win = 1;
            }
            if(p2-p1>val) {
                val = p2-p1;
                win = 2;
            }
        }
        output.write(win + " " + val);
        output.flush();
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
