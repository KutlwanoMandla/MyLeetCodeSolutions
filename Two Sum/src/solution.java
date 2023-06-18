import java.util.HashMap;

public class solution {
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // (to add,index)
            map.put(target - nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.keySet().contains(nums[i])) {
                result[0] = i;
                result[1] = map.get(nums[i]);
                System.out.println(result[1]);
                if (i != map.get(nums[i])) {
                    break;
                }
            }
        }

        return result;
    }
}