public class VariablesDemo {
    // Instance Variable
    String course = "Java Full Stack";

    // Static variable
    static int numberOfStudent = 2;

    void display(){
        System.out.println("Course: "+ course);
    }

    public static void main(String[] args) {
        // Local Variable
        String fullName = "John Peter";
        System.out.println("Welcome "+fullName);

        // Create an object for VariablesDemo class
        VariablesDemo objName = new VariablesDemo();
//        System.out.println("Course: "+ objName.course);
        objName.display();

        // Access the static variable
        System.out.println("Number of Students: "+ VariablesDemo.numberOfStudent);
        System.out.println("Number of Students: "+ objName.numberOfStudent);
    }
}
