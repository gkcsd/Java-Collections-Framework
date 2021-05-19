package basicjavaprograms;

public class uncheckedArithmeticException {
    public static void main(String[] args) {
        try {
            methodA();
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception caught");
            e.printStackTrace();
        }
    }
    static void methodA() {
        System.out.println("MethodA() started");
        int a = 15, b = 0, res = 0;

        res = a/b;
        System.out.println(res);
    }
}
