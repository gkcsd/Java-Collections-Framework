package PacticeProblems;
//GKCSD
import java.io.*;
import java.util.*;

public class ThunderBitz {
    public static long getPower(long n, long m) {
        final long MOD = 1000000007L;
        if(m == 0) return -1;
        if(m == 1) return n;

        if(m%2 == 0) {
            long ans = getPower(n,m/2);
            return (ans*ans)%MOD;
        }else {
            long ans = getPower(n,(m-1)/2);
            return ((n*ans)%MOD*ans)%MOD;
        }
    }

    private static void sol(FastScanner fs, PrintWriter out) throws IOException {
        long n = fs.nextInt();
        long m = fs.nextInt();
        long temp = getPower(2,n) - 1;
        out.println(getPower(temp, m));
    }

    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        long T = fs.nextInt();
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
