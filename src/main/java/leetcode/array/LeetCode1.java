package leetcode.array;

import java.util.*;

public class LeetCode1 {

    public static String longestCommonPrefix(String[] strs) {

        String minStr = strs[0];

        for(String str: strs) {
            if(str.length() < minStr.length()) {
                minStr = str;
            }
        }

        boolean allMatch = false;
        while(!minStr.isEmpty() && !allMatch) {
            allMatch = true;
            for(String str:strs) {
                if(!str.startsWith(minStr)) {
                    minStr = minStr.substring(0, minStr.length() - 1);
                    allMatch = false;
                    break;
                }
            }
        }
        return minStr;
    }

    public static int searchInsert(int[] nums, int target) {
        boolean found = false;
        int min = 0;
        int max = nums.length;
        int foundIndex = (min + max) / 2;
        while (!found || foundIndex >= max || foundIndex < 1 ){
            System.out.println("min: " + min);
            System.out.println("max: " + max);
            System.out.println("foundIndex: " + foundIndex);
            if(nums[foundIndex - 1] > target) {
                System.out.println("case 1");
                max = foundIndex ;
                foundIndex =(max - min) /2;
            } else if(nums[foundIndex + 1] < target){
                System.out.println("case 2");
                min = foundIndex;
                foundIndex = foundIndex + (max - min)/2;
            } else {
                System.out.println("case 3");
                found = true;
            }
        }

        return foundIndex;
    }

    /*public List<List<Integer>> subsets(int[] nums) {
        List<Integer> input = new ArrayList<>();
        for(int n: nums) {
            input.add(n);
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        int length = nums.length;
        for(int i = 1; i<= length; i++) {
            for(int j = 0; j < length; j++) {
                if(i + j <= length) {
                    result.add(input.subList(j, i + j));
                }

            }
        }
        return result;
    }*/


    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(0, nums, new ArrayList<>(), result);
        return result;
    }
    private static void generateSubsets(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current)); // Add the current subset to the result

        System.out.println();
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]); // Include nums[i] in the current subset
            generateSubsets(i + 1, nums, current, result); // Move on to the next element
            System.out.println();
            System.out.println("================================================");
            System.out.println("Params index = " + (index + 1));
            System.out.print("Current: ");
            for(Integer number : current) {
                System.out.print(  number + " , ");
            }
            current.removeLast(); // Backtrack to generate other subsets
        }
    }

    public int maxLengthBetweenEqualCharacters(String s) {
        int distance = -1;
        Map<String, Integer> sMap = new HashMap<>();
        char[] sChar = s.toCharArray();

        for(int i = 0; i< sChar.length; i++) {
            String value = String.valueOf(sChar[i]);
            Integer index = sMap.get(value);
            if(index != null) {
                distance = Math.max(i - index -1 , distance);
            } else {
                sMap.put(value, i);
            }
        }

        return distance;
    }

/*    public int lengthOfLIS(int[] nums) {

    }*/

    public static void main(String[] args) {
/*        //System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
        System.out.println(searchInsert(new int[]{1,3,5,6}, 2));

        String  s1 ="John";
        String s2 = "John ".trim().intern();
        System.out.println(s1 == s2);*/
        subsets(new int[]{1,2,3});

    }
}
