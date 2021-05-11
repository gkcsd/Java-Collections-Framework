package javalambda;

interface Test1 {
    void print();
}

public class NoParameterLambdaExpression {

    static void fun(Test1 t) {
        t.print();
    }

    public static void main(String[] args) {
        fun(() -> System.out.println("Hello"));
    }
}
