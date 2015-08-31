public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sortedNums = new int[nums.length];
        System.arraycopy(nums, 0, sortedNums, 0, nums.length);
        quickSort(sortedNums);
        int loPtr = 0;
        int hiPtr = nums.length-1;
        while (true) {
            if (sortedNums[loPtr] + sortedNums[hiPtr] < target) {
                loPtr++;
            } else if (sortedNums[loPtr] + sortedNums[hiPtr] > target) {
                hiPtr--;
            } else {
                break;
            }
        }

        int[] result = new int[2];
        for (int index = 0; index < nums.length; index++) {
            if (sortedNums[loPtr] == nums[index]) {
                result[0] = index+1;
                break;
            }
        }
        
        for (int index = 0; index < nums.length; index++) {
            if (sortedNums[hiPtr] == nums[index] && index != result[0]-1) {
                result[1] = index+1;
                break;
            }
        }
        
        quickSort(result);
        return result;
    }

    public static void quickSort(int[] nums) {
        quickSort(nums, 0, nums.length-1);
    }

    private static void quickSort(int[] nums, int lo, int hi) {
        if (lo < hi) {
            int pivot  = partition(nums, lo, hi);
            quickSort(nums, lo, pivot - 1);
            quickSort(nums, pivot + 1, hi);
        }
    }

    private static int partition(int[] nums, int lo, int hi) {
        int loPtr = lo;
        int hiPtr = hi;
        while (loPtr < hiPtr) {
            while (nums[hiPtr] >= nums[lo]) {
                if (loPtr >= hiPtr) {
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
        exch(nums, lo, loPtr);
        return loPtr;
    }
    
    private static void exch(int[] nums, int index1, int index2) {
        int tmp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = tmp;
    }
}