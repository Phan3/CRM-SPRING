package core;

import java.util.Optional;

public class OptionalResult {

    public static Optional<String> find(int id) {
        return id == 1 ? Optional.empty() : Optional.of("abc");
    }

    public static void main(String[] args) {
        if(find(10).isPresent()) {
            System.out.println(find(10).get());
        }
    }
}
