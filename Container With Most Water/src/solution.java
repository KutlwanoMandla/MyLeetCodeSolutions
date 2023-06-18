public class solution {
    public int maxArea(int[] height) {
        int max = 0, start = 0, end = height.length - 1, w = 0, h = 0;

        if (height.length == 2) {
            /* If the array has two elements */
            w = 1;
            h = Math.min(height[start], height[end]);
            return w * h;
        }

        while (start != end) {
            w = end - start;
            h = Math.min(height[start], height[end]);
            int area = w * h;

            if (max < area) {
                max = area;
            }

            if (height[start] < height[end]) {
                start++;
            } else if (height[start] > height[end]) {
                end--;
            } else {
                start++;
            }
        }
        return max;
    }

}