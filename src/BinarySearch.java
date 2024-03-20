public class BinarySearch {

    // Iterative binary search function
    public static int binarySearchIterative(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            // Check if target is present at mid
            if (arr[mid] == target)
                return mid;
            // If target greater, ignore left half
            if (arr[mid] < target)
                low = mid + 1;
            // If target is smaller, ignore right half
            else
                high = mid - 1;
        }
        // If target is not present in array
        return -1;
    }

    // Recursive binary search function
    public static int binarySearchRecursive(int[] arr, int target, int low, int high) {
        if (low <= high) { // Base case
            int mid = low + (high - low) / 2;
            // General case
            // If target is present at mid
            if (arr[mid] == target)
                return mid;

            // If target is smaller than mid, then it can only be present in left subarray
            if (arr[mid] > target)
                return binarySearchRecursive(arr, target, low, mid - 1);

            // Else the target can only be present in right subarray
            return binarySearchRecursive(arr, target, mid + 1, high);
        }
        // If target is not present in array
        return -1;
    }

    // Main method to test binary search
    public static void main(String[] args) {
        int target = 10;
        int[] largeArray = new int[1000000000];
        int result_iterative = binarySearchIterative(largeArray, target);
        int result_recursive = binarySearchRecursive(largeArray, target, 0 , largeArray.length - 1);

        if (result_iterative == -1)
            System.out.println("Element not present (iterative)");
        else
            System.out.println("Element found at index " + result_iterative + " (iterative)");

        if (result_recursive == -1)
            System.out.println("Element not present (recursive)");
        else
            System.out.println("Element found at index " + result_iterative + " (recursive)");
    }
}
