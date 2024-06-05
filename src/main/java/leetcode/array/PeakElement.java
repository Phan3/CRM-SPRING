package leetcode.array;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.*;

public class PeakElement {

    public static void findPeakElement(int[] input) {
        List<Integer> peakElements = new ArrayList<>();
        for(int i = 1; i< input.length - 1; i++) {
            if(input[i] > input[i-1] && input[i] > input[i+1]) {
                peakElements.add(input[i]);
            }
        }
        System.out.println(input + " : " + peakElements);
    }

    public static void findMin(int[] input) {
        int min = 0;
        for(int i = 0; i< input.length - 1; i++) {
            if( i == 0) {
                min = input[i];
            } else if(input[i] < min){
                min = input[i];
            }
        }
        System.out.println("Min : " + min);
    }

    public static void reverseArr(int[] input) {
        for(int i = 0 ; i < input.length / 2 - 1 ; i++) {
            int tmp = input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = tmp;
        }
        System.out.print("Reverse : ");
        for(int i : input) {
            System.out.print(i);
        }
    }

    public static void findMost(int[] input) {
        Map<Integer, Integer> findMap = new HashMap<>();
        for(int i: input) {
            if(findMap.get(i) == null) {
                findMap.put(i, 1);
            } else {
                int duplicateTime = findMap.get(i);
                findMap.put(i, duplicateTime + 1);
            }
        }
        int max = Integer.MIN_VALUE;
        for(Integer key: findMap.keySet()) {
            if(findMap.get(key) > max) {
                max = key;
            }
        }
        System.out.println("MAX :" + max);
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 15, 2, 23, 90, 67 };
        findPeakElement(arr);
        findMin(arr);
        reverseArr(arr);

        int[] arr_2 = {1, 2, 3, 3, 3, 3, 10};
        findMost(arr_2);
    }
}
