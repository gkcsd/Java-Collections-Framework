package PacticeProblems;
//GKCSD
import java.io.*;
import java.util.*;

public class PrimalityTest {

    static String isPrime(int n) {
        if(n == 1) return "no";
        if(n == 2 || n == 3) return "yes";

        if(n%2 == 0 || n%3 == 0) return "no";

        for(int i = 5; i*i <= n; i=i+6) {
            if(n%i == 0 || n%(i+2) == 0) {
                return "no";
            }
        }
        return "yes";
    }

    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();

        int T = fs.nextInt();
        while(T-- > 0) {
            int n = fs.nextInt();
           String res = isPrime(n);
            System.out.println(res);
        }
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        public FastScanner(){
            br=new BufferedReader(new InputStreamReader(System.in));
            st = null;
        }

        public String next() {
            while(st == null || !st.hasMoreElements())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            }catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        int[] readArray(int n) {
            int[] a=new int[n];
            for(int i=0; i<n; ++i) a[i]=nextInt();
            return a;
        }

        void close() throws IOException {
            br.close();
        }

    }
}
