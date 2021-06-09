package PacticeProblems;
//GKCSD
import java.io.*;
import java.util.*;

public class DoNotBeDistracted {

    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        int T = fs.nextInt();
        outer: while (T-- > 0) {
            int n = fs.nextInt();
            char[] line = fs.next().toCharArray();
            boolean[] seen = new boolean[26];

            for(int i = 1; i < n; i++) {
                if(line[i] != line[i-1]) {
                    seen[line[i-1] - 'A'] = true;
                }
                if(seen[line[i] - 'A']) {
                    out.println("NO");
                    continue outer;
                }
            }
            out.println("YES");
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
