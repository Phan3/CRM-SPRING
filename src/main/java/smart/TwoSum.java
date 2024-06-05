package smart;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++ ) {
                if( i != j && nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
    return result;
    }

    public static void main(String[] args) {
        int[] result = twoSum(new int[]{2,7,11,15}, 13);
        for(int number : result){
            System.out.println(number);
        }
    }
}
