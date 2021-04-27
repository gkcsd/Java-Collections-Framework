package basicjavaprograms;

class BubSortAlgo {
    void methodSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i ++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    void arraySort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class BubbleSort {
    public static void main(String[] args) {
        BubSortAlgo bsa = new BubSortAlgo();
        int arr[] = {2,45,8,6,4,85,62,47,255,84,695,657};
        System.out.println("Before Sort: ");
        bsa.arraySort(arr);
        System.out.println("After sort:");
        bsa.methodSort(arr);
        bsa.arraySort(arr);
    }
}
