package basicjavaprograms;

class Test extends Thread{
    public void runProcess() {
        System.out.println("Inside Test class");
    }
}

public class ThreadOne {
    public static void main(String[] args) {
        Test t = new Test();
        t.start();
        System.out.println("Inside main class");
    }
}
