package basicjavaprograms;

import java.util.Scanner;

public class ExceptionUsingThrows {
    public static void main(String[] args) {
        try {
            methodA();
            System.out.println("Exit try of main method");
        }catch (ArithmeticException e) {
            System.out.println("Arithmetic exception caught");
            e.printStackTrace();
        }
    }
    static void methodA() throws ArithmeticException {
        int a = 5, c;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter numeric value for b ");
        int b = in.nextInt();

        if(b == 0)
            throw new ArithmeticException();
        else
            c = a/b;

        System.out.println(c);
    }
}
