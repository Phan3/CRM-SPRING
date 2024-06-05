package smart;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.*;
import java.util.stream.Collectors;

public class jdk8 {

    public static Double average(List<Integer> lst) {
        return lst.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
    }

    public static List<String> uppercase(List<String> lst) {
        return lst.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    public static Integer sumEven(List<Integer> lst) {
        return lst.stream().filter(num -> num%2 == 0).mapToInt(Integer::intValue).sum();
    }

    public static List<Integer> removeDuplicate(List<Integer> lst) {
        return lst.stream().distinct().collect(Collectors.toList());
    }

    public static long countStartWith(List<String> lst, String letter) {
        return lst.stream().filter(str ->str.startsWith(letter)).count();
    }

    public static List<String> sort(List<String> lst) {

        //return lst.stream().sorted().collect(Collectors.toList());
        return lst.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public static Integer minValue(List<Integer> lst) {
        return lst.stream().min(Integer::compare).orElse(0);
    }

    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1,3,4,5,6);
        int result = lst.stream().mapToInt(Integer::intValue).sum();
        System.out.println("sdf");
        System.out.println("Sum : " + result);
        System.out.println("average : " + average(lst));

        System.out.println("Uppercase: " + uppercase(Arrays.asList("Heloo", "World")));

        System.out.println("Sum : " + sumEven(lst));

        int[] array = {1 ,2 ,3};
    }
}
