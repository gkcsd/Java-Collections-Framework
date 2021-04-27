package basicjavaprograms;

class TestThree implements Runnable {
    public void run() {
        System.out.println("Inside Test class");
    }
}

public class ThreadThree {
    public static void main(String[] args) {
        Thread t = new Thread(new TestThree());
        t.start();
        System.out.println("Inside the main class");
    }
}
