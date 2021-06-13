package PacticeProblems;
//Author- GKCSD

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class NotAdjacentMatrix {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int T = fs.nextInt();
        while (T-- > 0) {
            int n = fs.nextInt();
            if(n==1) {
                System.out.println(1);
                continue;
            }
            if(n==2) {
                System.out.println(-1);
                continue;
            }
            if(n==3) {
                System.out.println("2 9 7\n" +
                        "4 6 3\n" +
                        "1 8 5");
                continue;
            }

            for(int i = 0; i < n; i++) {
                int val=i*n;
                for(int j = 0; j < n; j++){
                    for(int k = 0; k+j<n && k<4; k++) {
                        int[] a = {2,4,1,3};
                        System.out.println((val+a[k])+ " ");
                    }
                    val+=4;
                }
                System.out.println();
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
