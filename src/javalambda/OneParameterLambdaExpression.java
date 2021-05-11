package javalambda;

interface Test2 {
    void print(Integer p);
}

public class OneParameterLambdaExpression {

    static void fun(Test2 t, Integer p) {
        t.print(p);
    }

    public static void main(String[] args) {
        fun(p -> System.out.println(p),10);
    }
}
