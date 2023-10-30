// Java program for implementation of Insertion Sort
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            insert(arr, i, arr[i]);
        }
    }

    private static void insert(int[] arr, int pos, int value) {
        int i = pos - 1;
        while (i >= 0 && arr[i] > value) {
            arr[i + 1] = arr[i];
            i--;
        }
        arr[i + 1] = value;
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        insertionSort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}


/* This code is contributed by Hemanth Prabhu */
