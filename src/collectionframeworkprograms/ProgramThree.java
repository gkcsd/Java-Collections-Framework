package collectionframeworkprograms;

public class ProgramThree {
    public static void main(String[] args) {
        Integer arr[] = { 10,20,30,20,40,50,60,20,30,80};
        Integer num = 20;
        System.out.println("The number " + num + " repeated " + count(arr, num) + " times");
    }
    public static < T > int count(T arr[], T x) {
        int res = 0;
        for ( T e: arr) {
            if (e.equals(x)) {
                res++;
            }
        }
        return res;
    }
}
