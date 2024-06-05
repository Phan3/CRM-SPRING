package jdk8.funtionalInterface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class RunClass {

    public static void tryFly(Flyable flyable) {
        flyable.canFly();
    }

    public static void main(String[] args) throws Exception {
        tryFly(()-> System.out.println("Hihi, I can fly"));

        Consumer<Integer> test = num -> System.out.print("Num : " + num);
        //test.accept(10);
        Consumer<Integer> test2 = num -> System.out.println("Num : " + num*2);
        Consumer<Integer> result = test.andThen(test2);
        result.accept(10);

        Runnable runnableTest = () -> System.out.println("This is runnaable test");
        runnableTest.run();

        Callable<Integer> callableTest = () -> 10;
        System.out.println(callableTest.call());

        List<String> lst = new ArrayList<>();
        lst.add("orange");
        lst.add("red");
        lst.add("green");
        lst.add("white");
        lst.add("blue");
        lst.stream().filter(n -> !n.isEmpty()).map(a -> a + "abe").forEach(System.out::println);
        String abc = lst.stream().min((a, b) -> -a.compareTo(b)).get();
        System.out.println("sddsf : " + abc);

    }
}
