package core.stringExecise;

import org.apache.logging.log4j.util.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stringexecise {

    public static String printEvenLength(String input) {
        String[] words = input.split(" ");
        List<String> output = Arrays.stream(words).filter(word -> word.length()%2 == 0).toList();
        return output.stream().collect(Collectors.joining(" ", "", ""));
    }

    public static void insertStringToString(String originalString, String stringToBeInserted, int index) {
        char[]  stringArray = originalString.toCharArray();
        List<String> stringLst = new ArrayList<>();
        for(char c : stringArray) {
            stringLst.add(String.valueOf(c));
        }
        List<String> stringToBeInsertedLst = Stream.of(stringToBeInserted.toCharArray()).map(String::valueOf).toList();
        stringLst.addAll(index, stringToBeInsertedLst);
        String result = stringLst.stream().collect(Collectors.joining("","",""));
        System.out.println(result);

    }

    public static boolean palindrome(String input) {
        String reverseStr = new StringBuilder(input).reverse().toString();
        return input.equals(reverseStr);
    }

    public static boolean palindrome_2(String input) {
        char[] inputChars = input.toCharArray();
        for(char c: inputChars) {

        }

        return true;
    }

    public static String swapPair(String input) {
        char[] inputChars = input.toCharArray();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < inputChars.length; i++) {
            if(i % 2 == 0 && i < inputChars.length -1) {
                result.append(inputChars[i+1]).append(inputChars[i]);
            }
        }
        return result.toString();
    }

    public static String removeLeadingZero(String input) {
        char[] chars = input.toCharArray();
        int index = 0;
        while(chars[index] == '0') {
            index++;
        }
        return input.substring(index);
    }

    public static String sortString(String input) {
        char[] inputChar = input.toCharArray();
        Arrays.sort(inputChar);
        return new String(inputChar);
    }

    public static void sum(String firstNumber, String secondNumber) {
        char[] firstNumberChars = firstNumber.toCharArray();
        char[] secondNumberChars = secondNumber.toCharArray();

        for(char firstChar : firstNumberChars) {

        }
    }

    public static void main(String[] args) {
        System.out.println(printEvenLength("This is java e tests"));
        insertStringToString("GeeksGeeks", "For", 4 + 1);
        System.out.println(swapPair("GeeksForGeeks"));
        System.out.println("Remove leading zero: " + removeLeadingZero("000012356098"));
        System.out.println("Sort String: " + sortString("software"));
    }
}
