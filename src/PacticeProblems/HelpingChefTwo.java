package PacticeProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//Author:- GKCSD

public class HelpingChefTwo {
	public static void mai(String[] args) {
	//GKCSD your code...
		FastScanner fs = new FastScanner();
		int T =fs.nextInt();
		while(T-- > 0) {
		    int n = fs.nextInt();
            if(n < 10) {
                System.out.println("Thanks for helping Chef!");
            }else {
                System.out.println("-1");
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
