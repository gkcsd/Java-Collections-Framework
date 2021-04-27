package basicjavaprograms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 10 , 20, 40, 30, 50 ,80, 60};
        int x = 30;

        int res = search(arr,x);
        if(res == -1) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Element is present at array index " + res);
        }
    }
    public static int search(int arr[], int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
