package PacticeProblems;
//GKCSD
import java.io.*;
import java.util.*;

public class ThunderBitz {
    final static long MOD = 1000000007L;

    static int printF(long a, int b, long MOD) {
        long res = 1;
        while(b>0) {
            if(b == 1) {
                res = (res * a) % MOD;
            }
                a = (a*a)%MOD;
                b = b>>1;

        }
        return (int) res;
    }

    private static void sol(FastScanner fs, PrintWriter out) throws IOException {
        int n = fs.nextInt();
        int m = fs.nextInt();
        int num = printF(2,n, MOD) - 1;
        out.println(printF(num,m, MOD));

    }

    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        int T = fs.nextInt();
        while(T-- > 0) {
            sol(fs, out);
        }

        out.flush();
        fs.close();
        out.close();
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
