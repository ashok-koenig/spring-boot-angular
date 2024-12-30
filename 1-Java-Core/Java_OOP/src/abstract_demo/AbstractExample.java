package abstract_demo;

abstract class MyClass{
    // Concrete method - with implementation
    void concreteMethod(){
        System.out.println("This is Concrete Method");
    }
    // Abstract method - without implemenation
   abstract void abstractMethod();
}

public class AbstractExample extends MyClass{
    @Override
    void abstractMethod() {
        System.out.println("THis is abstract method implementation in extended class.");
    }

    public static void main(String[] args) {
        MyClass obj2 = new MyClass() {
            @Override
            void abstractMethod() {

            }
        };
        AbstractExample obj = new AbstractExample();
        obj.concreteMethod();
        obj.abstractMethod();
    }
}
