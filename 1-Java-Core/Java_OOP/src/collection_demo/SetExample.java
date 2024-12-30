package collection_demo;

import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<String> friends= new HashSet<>();
        friends.add("John");
        friends.add("Bob");
        friends.add("John");

        System.out.println("Friends Set: "+ friends);

        for(String name: friends){
            System.out.println("Name: "+ name);
        }
    }
}
