package PacticeProblems;
//GKCSD
import java.io.*;
import java.util.*;

public class ValidTriangles {

    private static void sol(FastScanner fs, PrintWriter out) throws IOException {
        int a = fs.nextInt();
        int b = fs.nextInt();
        int c = fs.nextInt();
        String ans = "";
        if((a >= 1 && a <= 180) && (b >= 1 && b <= 180) && (c >= 1 && c <= 180)) {
            int sum = a + b + c;
            ans = (sum == 180) ? "YES" : "NO";
        }
        out.println(ans);
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
