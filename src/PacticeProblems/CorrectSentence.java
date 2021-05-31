package PacticeProblems;
//Author- GKCSD

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CorrectSentence {
    public static void main(String[] args){
        FastScanner fs = new FastScanner();
        int T = fs.nextInt();
        while (T-- > 0) {
            int n = fs.nextInt();
            char str[][]= new char[n][100];
            for(int i = 0; i < n; i++) {
                str[i] = fs.next().toCharArray();
            }
            int s = 0;
            System.out.println();
            for(int i = 0; i < n; i++) {
                if(str[i][0] >= 'a' && str[i][0] <= 'z') {
                    if (str[i][0] >= 'a' && str[i][0] <= 'm') {
                        for(int j = 0; str[i][j] != '\0'; j++) {
                            if(!(str[i][j] >= 'a' && str[i][j] <= 'm')) {
                                s = 1;
                                break;
                            }
                        }
                    } else {
                        s = 1;
                    }
                } else {
                    if(str[i][0] >= 'N' && str[i][0] <= 'Z') {
                        for(int j = 0; str[i][j] != '\0'; j++) {
                            if(!(str[i][j] >= 'N' && str[i][j] <= 'Z')) {
                                s = 1;
                                break;
                            }
                        }
                    }else {
                        s = 1;
                    }
                }
                if(s == 1) {
                    break;
                }
            }
            if(s == 1) {
                System.out.println("NO");
            }else {
                System.out.println("YES");
            }
        }
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        public String next() {
            while (!st.hasMoreElements())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; ++i) a[i] = nextInt();
            return a;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        float nextFloat() {
            return Float.parseFloat(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}