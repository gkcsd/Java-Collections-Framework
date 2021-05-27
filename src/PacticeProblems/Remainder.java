package PacticeProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Remainder{
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int T = fs.nextInt();
        while(T-- > 0) {
           int a = fs.nextInt();
           int b = fs.nextInt();

           int res = a%b;
            System.out.println(res);
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

