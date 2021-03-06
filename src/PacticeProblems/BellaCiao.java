package PacticeProblems;
//GKCSD
import java.io.*;
import java.util.*;

public class BellaCiao {

    private static void sol(FastScanner fs, PrintWriter out) throws IOException {
        long D = fs.nextInt(); //total no days hijack
        long d = fs.nextInt(); // incrementation day interval
        long P = fs.nextInt(); // printing money for each day
        long Q = fs.nextInt(); // amount want to increase after interval
        long count;
        long x = D/d;

        if(x%2 == 0) {
            count = d*((x/2)*(2 * P +(x-1)*Q));
        } else {
            count = d * (x * (P+((x-1)/2)*Q));
        }
        count += (D%d) * (P + (x)*Q);
        out.println(count);
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
