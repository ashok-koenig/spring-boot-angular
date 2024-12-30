package collection_demo;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();
        employees.put(101, "JOhn");
        employees.put(102, "Bob");
        employees.put(103, "Smith");
        employees.put(101, "Peter");

        System.out.println("Employees: "+ employees);

        // Accessing with key
        System.out.println("Employee with id 102: "+ employees.get(102));

        for(Map.Entry<Integer, String> entry: employees.entrySet()){
            System.out.println("Employee ID: "+ entry.getKey() + " & Name: "+ entry.getValue());
        }
    }
}
