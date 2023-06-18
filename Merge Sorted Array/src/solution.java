public class solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];
        int left = 0, right = 0, i = 0;

        while (left < m && right < n) {
            if (nums1[left] < nums2[right]) {
                result[i++] = nums1[left++];
                System.out.println("left");
            } else if (nums1[left] > nums2[right]) {
                System.out.println("right");
                result[i++] = nums2[right++];
            } else {
                System.out.println("left");
                result[i++] = nums1[left++];
            }
        }
        // wrapping up
        while (left < m) {
            result[i++] = nums1[left++];
        }
        while (right < n) {
            result[i++] = nums2[right++];
        }
        // copying
        for (int j = 0; j < result.length; j++) {
            nums1[j] = result[j];
        }
    }
}