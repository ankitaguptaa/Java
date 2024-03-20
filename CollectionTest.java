import javax.sound.midi.Soundbank;
import java.lang.annotation.ElementType;
import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectionTest {

    static List<String> bird = new ArrayList<>(Arrays.asList("sparrow", "magpie", "pegion"));
    static List<String> animal = new LinkedList<>();

    static Map<String, Integer> fruits = Map.of(
            "apple", 10,
            "banana", 20,
            "blueberries", 30,
            "kiwi", 40);

    public static void main(String[] args) {
        animal = new ArrayList<>();
        //bird = new LinkedList<>();
        bird.add("crow");
        //bird.forEach( System.out::println);
        bird.stream()
                .filter(Predicate.not(s -> s.equalsIgnoreCase("Sparrow")))
                .forEach(System.out::println);


        fruits.entrySet()
                .stream()
                .filter(entry ->
                        entry.getValue() > 10
                )
                .forEach(entry ->
                        System.out.println(entry.getKey())
                );


        List<String> listOfFruits = fruits.keySet().stream().map(String::toUpperCase).toList();
        listOfFruits.forEach(System.out::println);

        Optional<Integer> min = fruits.values().stream().min(Comparator.comparing(Integer::intValue));
        System.out.println(min);

        Map<Character, List<Map.Entry<String, Integer>>> fruitsWithSameLetter = fruits.entrySet().stream().collect(Collectors.groupingBy(entry -> entry.getKey().charAt(0)));
        System.out.println(fruitsWithSameLetter);

    }
}
