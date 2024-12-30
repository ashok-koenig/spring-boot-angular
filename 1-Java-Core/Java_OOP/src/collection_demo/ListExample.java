package collection_demo;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        // String array list
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.remove("Apple");
        System.out.println("Fruits List: "+ fruits);
        // Finding the number of elements in the array list
        System.out.println("Size: "+ fruits.size());
        // Accessing an element
        System.out.println("Second fruit: "+ fruits.get(1));
        fruits.clear();

        // Integer Array list
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        Integer sum = 0;
        for(Integer num: numbers){
            System.out.println(num);
            sum+=num;
        }
        System.out.println("Sum is "+ sum);

    }
}
