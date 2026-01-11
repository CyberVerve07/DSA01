//Problem Statement
//
//You are given a sorted array that has been rotated at an unknown pivot.
//
//Find the minimum element in the array.
public class Question4 {

    public static int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // If mid element is greater than the rightmost,
            // the minimum is in the right half
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                // Minimum is at mid or in the left half
                high = mid;
            }
        }

        // low == high points to the minimum
        return nums[low];
    }

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{3,4,5,1,2}));      // 1
        System.out.println(findMin(new int[]{4,5,6,7,0,1,2}));  // 0
        System.out.println(findMin(new int[]{11,13,15,17}));   // 11
        System.out.println(findMin(new int[]{1,3,4,5,6,7}));             // 1
    }
}
