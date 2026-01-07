//Wap to Merge sorted array
import java.util.Arrays;

 class MergeSortedArrays {

    public static int[] merge(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        int[] result = new int[n + m];

        int i = 0, j = 0, k = 0;

        // Compare and merge
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1
        while (i < n) {
            result[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2
        while (j < m) {
            result[k++] = arr2[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 2, 4, 6, 8};
        int[] arr2 = {1, 3, 5, 7, 9};

        int[] merged = merge(arr1, arr2);
        System.out.println(Arrays.toString(merged));
    }
}

