
import java.util.*;


public class JavaTest {


    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "sdf");
        map.put(2, "dfgdfg");
        map.put(3, "sddfgdfgf");
        map.put(4, "dfg");


        for(Integer e : map.keySet()) {
            System.out.println(e + " : " + map.get(e));
        }

        List<Movie> movies = Arrays.asList( new Movie(1, "sfsdf"),
                new Movie(3, "sdf"),
                new Movie(2, "asdasd"));
        //Collections.sort(movies);

        movies.sort(Comparator.comparing(Movie::getId));

        movies.sort(new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o2.id - o1.id;
            }
        });
        System.out.println(movies);
        vectorTest();
        stringTest();


    }
    public static void vectorTest() {
        List<String> animals = new Vector<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Dog");

        System.out.println(animals);
        System.out.println(animals.size());
        System.out.println();

/*        for (String animal : animals) {
            System.out.println(animal);
            animals.remove(animal);s
;        }*/

        Iterator<String> i = animals.iterator();
        while (i.hasNext()) {
            String animal = i.next();
            System.out.println(animal);
            i.remove();
        }
    }


    public static void stringTest() {
        StringJoiner stringJoiner = new StringJoiner(",");
        List lst = Arrays.asList("apple", "banana");

        String animal = "10";
        System.out.println("dfgdfgdfg:" + Integer.getInteger(animal));

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(animal);
    }


    public static void mapExample() {
        Map<Integer, Movie> movies = new HashMap<>();

    }
}
