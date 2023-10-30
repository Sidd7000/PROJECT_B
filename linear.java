// Java code for linearly search            


public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;  // Element found, return its index
            }
        }
        return -1;  // Element not found
    }

    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 23, 56, 89, 34};
        int target = 23;

        int result = linearSearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}



/* This code is contributed by Hemanth Prabhu */
