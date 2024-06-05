package core;

import java.util.Set;
import java.util.TreeSet;

public class Outer {

    String outerVariable;
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();

    }

     class Inner {
        void innerSay() {
            Set<String> sdf = new TreeSet<>();
            System.out.println("this is inner " + outerVariable);
        }
    }
}
