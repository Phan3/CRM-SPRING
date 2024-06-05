package core;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayExample {
    public static Integer[] sortArr(Integer[] arr) {
        Arrays.sort(arr);
        Arrays.sort(arr, Collections.reverseOrder());

        List<String> lst = new ArrayList<>();
        //lst.stream();


        Set<String> setexample = new HashSet<>();
        setexample.add("sdf");
        setexample.add("sdf");
        setexample.add("sdf");

        for(String test: setexample) {
            System.out.println(test);
        }

        Iterator<String> sdfsdf= setexample.iterator();
        /*while (sdfsdf.hasNext()) {

        }*/
        List<String> asdf = "sdfsdf".chars().filter(a-> a=='c').mapToObj(String::valueOf).toList();

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,2};
        //System.out.println(Arrays.toString(sortArr(arr)));

        System.out.println("Reverse of Hello World is : " + reverseStr("Hello world"));
        System.out.println("Reverse of Hello World is : " + reverseStrUsingUtilities("Hello world"));
        System.out.println("Array to set: ");
        arrayToSet();
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456
        };
        sortNumericArray(my_array1);

        Arrays.stream(my_array1).forEach(System.out::println);
        int result = Arrays.stream(my_array1).sum();
        OptionalDouble result_2 = Arrays.stream(my_array1).average();
        System.out.println("average : " + result_2.orElse(0));
        System.out.println("Result : " + result);
        int[][] matrix = new int[10][10];

    }

    public static String reverseStr(String str) {
        char[] chars = str.toCharArray();
        int length = chars.length;
        for(int i = 0 ; i < (length -1)/2 ; i++) {
            char temp = chars[i];
            chars[i] = chars[length - i -1];
            chars[length - i -1] = temp;
        }
        return Arrays.toString(chars);
    }

    public static int[] sortNumericArray(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }


    public static String reverseStrUsingUtilities(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void arrayToSet() {
        double[] arr = {2,4,5,3,5};
        Set<Double> lst = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        System.out.println(lst);
    }
}
