package generics_demo;

class Box<T>{
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

public class GenericClassExample {
    public static void main(String[] args) {
        // Integer box
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.setValue(100);
        System.out.println("Integer box value: "+ integerBox.getValue());

        // String box
        Box<String> stringBox = new Box<String>();
        stringBox.setValue("My Box");
        System.out.println("String box Value: "+ stringBox.getValue());
    }
}
