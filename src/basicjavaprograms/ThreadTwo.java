package basicjavaprograms;

class TestTwo extends Thread{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Inside the test class");
        }
    }
}

public class ThreadTwo {
    public static void main(String[] args) throws InterruptedException{
        TestTwo t2 = new TestTwo();
        t2.start();
        for(int i = 0; i < 5; i++) {
            System.out.println("Inside main method");
            Thread.sleep(1);
        }
    }
}
