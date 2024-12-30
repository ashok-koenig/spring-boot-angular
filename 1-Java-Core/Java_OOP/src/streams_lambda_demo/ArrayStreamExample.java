package streams_lambda_demo;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayStreamExample {

    static void display(String value){
        System.out.println(value);
    }

    public static void main(String[] args) {
        System.out.println("Streams from Array");
        String[] courses = {"HTML", "CSS", "JavaScript", "Java", "Spring Boot", "Angular"};
        Stream<String> courseStream = Arrays.stream(courses);
        // Assigning a static method to display the stream values.
//        courseStream.forEach(ArrayStreamExample::display);

        // Using System.out.println to display the values
//        courseStream.forEach(System.out::println);

        // Using Lambda function to display the stream values
        courseStream.forEach(course -> System.out.println(course));
    }
}
