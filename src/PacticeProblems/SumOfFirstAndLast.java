package PacticeProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class SumOfFirstAndLast{
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int T = fs.nextInt();
        while(T-- > 0) {
            int n = fs.nextInt();
            int ld = n%10;
            int fd = 0;
            while(n!=0) {
                fd = n%10;
                n=n/10;
            }
            System.out.println(fd+ld);
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
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        float nextFloat(){
            return Float.parseFloat(next());
        }
        String nextLine(){
            String str="";
            try{
                str=br.readLine();
            }catch (Exception e){
                e.printStackTrace();
            }
            return str;
        }
    }
}


