public class Person {
    private String name;
    private short age;

    Person(String name, short age){
        this.name = name;
        this.age = age;
    }

    void introduce(){
        System.out.println("My name is "+ name + " and age is "+ age);
    }
}
