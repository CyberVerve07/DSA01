
    //Given an integer array nums, return an array
    //Restrictions (IMPORTANT)
    //
    //You cannot use division
    //
    //Time complexity must be O(n)
    //
    //Extra space must be O(1) (output array allowed)


    import java.util.Arrays;

    public class Question3 {

        public static int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            int[] result = new int[n];

            // Step 1: left products
            result[0] = 1;
            for (int i = 1; i < n; i++) {
                result[i] = result[i - 1] * nums[i - 1];
            }

            // Step 2: right product in one variable
            int rightProduct = 1;
            for (int i = n - 1; i >= 0; i--) {
                result[i] = result[i] * rightProduct;
                rightProduct *= nums[i];
            }

            return result;
        }

        public static void main(String[] args) {
            int[] nums1 = {1, 2, 3, 4};
            System.out.println(Arrays.toString(productExceptSelf(nums1)));
            // [24, 12, 8, 6]

            int[] nums2 = {-1, 1, 0, -3, 3};
            System.out.println(Arrays.toString(productExceptSelf(nums2)));
            // [0, 0, 9, 0, 0]
        }
    }


