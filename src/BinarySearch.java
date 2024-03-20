public class BinarySearch {

    // Iterative binary search function
    public static int binarySearchIterative(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[mid] < target)
                low = mid + 1;

            else
                high = mid - 1;
        }

        return -1;
    }

    // Recursive binary search function
    public static int binarySearchRecursive(int[] arr, int target, int low, int high) {
        if (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[mid] > target)
                return binarySearchRecursive(arr, target, low, mid - 1);

            return binarySearchRecursive(arr, target, mid + 1, high);
        }

        return -1;
    }

    // Main method to test binary search
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int target = 4;

        int result_iterative = binarySearchIterative(arr, target);
        int result_recursive = binarySearchRecursive(arr, target);

        if (result_iterative == -1)
            System.out.println("Element not present (iterative)");
        else
            System.out.println("Element found at index " + result_iterative + "(iterative)");

        if (result_recursive == -1)
            System.out.println("Element not present (recursive)");
        else
            System.out.println("Element found at index " + result_iterative + "(recursive)");
    }
}
