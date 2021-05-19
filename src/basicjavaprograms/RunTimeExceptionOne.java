package basicjavaprograms;

public class RunTimeExceptionOne {
    public static void main(String[] args) {
        int x1,x2,sum;
       try {
           x1 = Integer.parseInt(args[0]);
           x2 = Integer.parseInt(args[1]);

           sum = x1 + x2;
           System.out.println(sum);
       }catch(ArrayIndexOutOfBoundsException e) {
           System.out.println("Insufficient Numbers");
       }
    }
}
