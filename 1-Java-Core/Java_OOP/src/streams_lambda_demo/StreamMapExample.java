package streams_lambda_demo;

import java.util.List;

public class StreamMapExample {
    public static void main(String[] args) {
        List<String> names = List.of("John", "Peter", "Bob", "Smith", "July");

        names.stream().map(name -> name.toUpperCase()).forEach(System.out::println);

        List<Integer> prices = List.of(444, 555, 666, 777);
        Integer discount = 10;

        List<Integer> pricesAfterDiscount = prices.stream().map(price -> price - (price * discount/100)).toList();

        System.out.println("Price after discount: "+pricesAfterDiscount);
    }
}
