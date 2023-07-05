import java.util.Arrays;
public class solution {

    public void rotate(int [] nums, int k){
        if(k < 0)return;
        if(nums.length == 1) return;
        if(nums.length == k) return;
        
        if(k > nums.length) k = k % nums.length;
        
        int[] newArray = new int[nums.length];

        for(int i = 0; i < nums.length;i++){
            if(i + k < nums.length){
                newArray[i + k] = nums[i];
            }else{
                int spacesLeft = nums.length - 1 - i;
                int newIndex = k - spacesLeft - 1;
                newArray[newIndex] = nums[i];
            }

        }
        System.arraycopy(newArray, 0, nums, 0, newArray.length);
    }

}