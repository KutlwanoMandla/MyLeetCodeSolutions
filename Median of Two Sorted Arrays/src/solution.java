import java.util.Arrays;

public class solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int left = 0, right = 0;

        int[] arr = new int[nums1.length + nums2.length];

        for (int i = 0; i < arr.length; i++) {
            if (i < nums1.length)
                arr[i] = nums1[left++];
            else if (i >= nums1.length)
                arr[i] = nums2[right++];
        }
        Arrays.sort(arr);

        int mid = arr.length / 2;
        double ans = 0.0;
        if (arr.length % 2 == 0) {
            ans = (double) (arr[mid] + arr[mid - 1]) / 2.0;

        } else {
            ans = (double) arr[mid];
        }

        return ans;
    }
}