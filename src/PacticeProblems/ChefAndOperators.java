package PacticeProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChefAndOperators {
	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		int t =fs.nextInt();
		while(t-- > 0) {
		    int a = fs.nextInt();
		    int b = fs.nextInt();

		    if(a < b) {
                System.out.println("<");
            } else if(a > b) {
                System.out.println(">");
            } else if(a == b) {
                System.out.println("=");
            }
        }

	}

	static class FastScanner {
		BufferedReader br;
		StringTokenizer st;
		public FastScanner(){
			br=new BufferedReader(new InputStreamReader(System.in));
		}
		public String next() {
			while(st==null || !st.hasMoreElements())
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

		long nextLong() { return Long.parseLong(next()); }

		double nextDouble() {
		    return Double.parseDouble(next());
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
	}
}