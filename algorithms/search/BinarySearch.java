public class BinarySearch {
    public searchByRecursive(int[] arr, int lo, int hi, int key) {
        if(lo > hi) {
            return -1;
        }

        int mid  = lo + (hi - l0) / 2;
        if (key == arr[mid]) {
            return mid
        } else if (key > arr[mid]) {
            return searchByRecursive(arr, mid + 1, hi, key);
        } else {
            return searchByRecursive(arr, lo, mid - 1, key);
        }
    }

    public searchByCircle(int arr[], int lo, int hi, int key) {
        while (hi >= lo) {
            int mid = lo + (hi - lo) / 2;
            if (key == arr[mid]) {
                return mid
            } else if (key > arr[mid]) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }
}