package streams_lambda_demo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionStreamExample {
    public static void main(String[] args) {
        List<String> names = List.of("John", "Peter", "Bob", "Smith", "July");
        Stream<String> nameStream = names.stream();
        System.out.println("Streams of Names");
//        nameStream.forEach(System.out::println);

        List<String> filteredNames = nameStream.filter(name-> name.startsWith("J")).collect(Collectors.toList());

        System.out.println(filteredNames);
    }
}
