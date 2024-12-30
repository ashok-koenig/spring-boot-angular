package streams_lambda_demo;

import java.util.List;

class Employee{
    String name;
    double salary;
    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public String toString(){
        return name + " salary is "+ salary;
    }
}

public class EmployeeStreamExample {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                                        new Employee("John", 20000),
                                        new Employee("Peter", 15000),
                                        new Employee("Bob", 25000),
                                        new Employee("Smith", 30000)
                                        );
        System.out.println(employees);

        // Filter and print employees getting more than 20000
        employees.stream().filter( emp -> emp.salary > 20000).forEach(System.out::println);
    }
}
