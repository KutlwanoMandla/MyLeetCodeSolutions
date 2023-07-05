import java.util.Arrays;

public class solution {
    public int[] twoSum(int []numbers,int target){
        int [] result = new int[2];
        for (int i = 0; i < numbers.length;i++){
            int toAdd = target - numbers[i];
            int secondIndex = binarySearch(numbers, toAdd, i + 1, numbers.length - 1);
            if(secondIndex != -1) {
                System.out.println("Found a match!!");
                result[0] = i + 1;
                result[1] = secondIndex + 1;
                break;
            }
        }
        return result;
    }

    public static int binarySearch(int[]array, int target,int low,int high){
        if(high < low) return -1;

        int mid = low + (high - low)/2;
        
        int cmp = array[mid];
        if(target < cmp){
            return binarySearch(array, target, low, mid - 1);
        }else if(target > cmp){
            return binarySearch(array, target, mid + 1, high);
        }else{
            return mid;
        }
    }


}