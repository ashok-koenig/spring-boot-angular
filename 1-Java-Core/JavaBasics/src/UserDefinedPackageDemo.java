//import mypackage.MyClass;
//import mypackage1.MyClass;

public class UserDefinedPackageDemo {
    public static void main(String[] args) {

//        MyClass obj = new MyClass();
//        obj.display();

        // We can prefix the package name before the class name to avoid conflict between the class names.
        mypackage.MyClass obj = new mypackage.MyClass();
        obj.display();

        mypackage1.MyClass obj1 = new mypackage1.MyClass();
        obj1.display();
    }
}
