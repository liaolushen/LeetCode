package sort;

public class Quick {
    private Quick() { }
    
    public static void quickSort(int[] nums) {
        sort(nums, 0, nums.length-1);
    }

    private static void sort(int[] nums, int lo, int hi) {
        if (hi > lo) {
            int pivot = partition(nums, lo, hi);
            sort(nums, lo, pivot-1);
            sort(nums, pivot+1, hi);
        }
    }

    private static int partition(int[] nums, int lo, int hi) {
        int loPtr = lo;
        int hiPtr = hi;
        while (loPtr < hiPtr) {
            while (nums[hiPtr] >= nums[lo]) {
                if (hiPtr <= loPtr) {
                    break;
                }
                hiPtr--;
            }

            while (nums[loPtr] <= nums[lo]) {
                if (loPtr >= hiPtr) {
                    break;
                }
                loPtr++;
            }
            exch(nums, loPtr, hiPtr);
        }
        exch(nums, lo, hiPtr);
        return hiPtr;
    }

    private static void exch(int[] nums, int index1, int index2) {
        int tmp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = tmp;
    }
}