// Java implementation of iterative Binary Search
public class BinarySearch {
    // Binary search function
    public static int binarySearch(int[] arr, int target) {
        int left = 0;                // Initialize the left boundary to the beginning of the array
        int right = arr.length - 1;  // Initialize the right boundary to the end of the array

        while (left <= right) {      // Continue the loop as long as the left boundary is less than or equal to the right boundary
            int mid = left + (right - left) / 2;  // Calculate the middle index

            if (arr[mid] == target) {
                return mid;  // Element found, return its index
            } else if (arr[mid] < target) {
                left = mid + 1;  // Adjust the left boundary to the right half of the remaining array
            } else {
                right = mid - 1;  // Adjust the right boundary to the left half of the remaining array
            }
        }

        return -1;  // Element not found, return -1
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;

        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
