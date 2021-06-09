package PacticeProblems;
//GKCSD
import java.io.*;
import java.util.*;

public class OrdinaryNumbers {

    private static void sol(FastScanner fs, PrintWriter out) throws IOException {
        int n = fs.nextInt();
        int counter = 0;
        for(int digit = 1; digit <= 9; digit++) {
            for(int len = 1; len <10; len++) {
                long val = 0;
                for(int i = 0; i < len; i++) {
                    val = val*10+digit;
                }
                if(val<=n) {
                    counter++;
                }
            }
        }
    out.println(counter);
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