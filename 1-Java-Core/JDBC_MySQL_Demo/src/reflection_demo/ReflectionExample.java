package reflection_demo;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

class TestClass{
    int field1 = 100;
    public String field2 = "Public string field";
    private static final String field3 = "Fixed private field";
    void method1(){
        System.out.println("Method 1 called...");
    }
}


public class ReflectionExample {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // Normal way
//        TestClass obj = new TestClass();
//        System.out.println("Value: "+ obj.field1);
//        obj.method1();

        // Reflection way of creating object
        TestClass obj1 = TestClass.class.getDeclaredConstructor().newInstance();
//        System.out.println("Value: "+ obj1.field1);
//        obj1.method1();

        // Fetch all the fields in a class
        Field[] fields = TestClass.class.getDeclaredFields();

//        System.out.println("All Fields: "+ Arrays.toString(fields));
        for(Field field: fields){
            System.out.println(field);
            field.setAccessible(true);
            System.out.println(field.get(obj1));
        }

        Method[] methods = TestClass.class.getDeclaredMethods();

        for(Method method: methods){
            System.out.println(method);
        }
    }
}
