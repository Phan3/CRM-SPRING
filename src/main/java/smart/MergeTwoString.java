package smart;

import java.util.*;
import java.util.stream.Collectors;

public class MergeTwoString {

    public static String mergeAlternately(String word1, String word2) {
        if(word1.isEmpty()) return word2;
        if(word2.isEmpty()) return word1;
        StringBuilder result = new StringBuilder();
        int word2Index = 0;
        for(int i = 0; i< word1.length(); i++) {
            result.append(word1.charAt(i));
            if(word2Index < word2.length()) {
                result.append(word2.charAt(i));
            }
            word2Index++;
        }
        if(word2.length() > word1.length()) {
            result.append(word2.substring(word1.length()));
        }

        return result.toString();
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> nums1Set = Arrays.stream(nums1).boxed().collect(Collectors.toList());
            List<Integer> nums2Set = Arrays.stream(nums2).boxed().collect(Collectors.toList());

            result.add(nums1Set.stream().filter(num2 -> !nums2Set.contains(num2)).toList());
            result.add(nums2Set.stream().filter(num2 -> !nums1Set.contains(num2)).toList());
            return result;
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));//apbqcr
        System.out.println(mergeAlternately("ab", "pqrs"));// apbqrs
        System.out.println(mergeAlternately("abcd", "pq"));// apbqcd

        System.out.println(findDifference(new int[]{1,2,3}, new int[]{2,4,6}));
    }
}
