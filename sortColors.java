public class sortColors {
    public static void sc(int[] arr) {
        // dutch national flag algorithm
        // low - Points to the position where the next 0 should go
        // high - Points to the position where the next 2 should go
        // mid: Used to traverse the array.

        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {

            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void printArr(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = { 2, 0, 2, 1, 1, 0 };
        sc(arr);
        printArr(arr);
    }
}