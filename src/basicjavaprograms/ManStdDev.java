package basicjavaprograms;

public class ManStdDev {
    public static void main(String[] args) {
        int[] arr = {4,2,3,5,8,74};
        int sum = 0,sumSquare = 0;
        double mean;
        double dev;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            sumSquare += arr[i] * arr[i];
        }
       mean = (double)sum/ arr.length;
        dev = Math.sqrt((double) sumSquare/ arr.length - mean * mean);

        System.out.printf("The mean of given array is %.2f\n", mean);
        System.out.printf("The deviation is of given array is %.2f\n", dev);
    }
}
