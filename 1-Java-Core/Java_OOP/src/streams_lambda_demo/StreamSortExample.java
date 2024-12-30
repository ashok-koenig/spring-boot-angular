package streams_lambda_demo;

import java.util.List;

public class StreamSortExample {
    public static void main(String[] args) {
        List<String> names = List.of("John", "Peter", "Bob", "Smith", "July");

        System.out.println("Sorting in Ascending order");
        names.stream().sorted().forEach(System.out::println);

        System.out.println("Sorting in Descending order");
        names.stream().sorted((a,b)-> b.compareTo(a)).forEach(System.out::println);
    }
}
