package jdk17newFeature.methodReference;

import java.util.Arrays;
import java.util.List;

public class DemoMethodReference1 {

    public static void main(String[] args) {
        int a = 10;
        int b = 7;

        int sum = doAction(a, b, MathUtils::sum);
        System.out.println(a + " + " + b + " = " + sum); // 10 + 7 = 17

        int minus = doAction(a, b, MathUtils::minus);
        System.out.println(a + " - " + b + " = " + minus); // 10 - 7 = 3


        Hello s = (name, com) -> "Hello, " + name + ". Welcome to " + com;
        System.out.println(s.sayHello("newbie", "Lambda"));

        Hello example2 = (name, com) -> "Hello example 2";
        System.out.println(example2.sayHello("sdf", "Phan Dao"));


        List<Integer> number = Arrays.asList(3,4,5);
        number.forEach(System.out::println);
        doAction(5 ,7, (m,n) -> m + n +10 );
    }

    public static int doAction(int a, int b, ExecuteFunction func) {
        return func.execute(a, b);
    }
}
@FunctionalInterface
interface Hello {
    String sayHello(String name, String com);
}

