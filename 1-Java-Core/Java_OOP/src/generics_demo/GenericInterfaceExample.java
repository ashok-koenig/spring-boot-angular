package generics_demo;

interface Printable<T>{
    void print(T value);
}

class Printer<T> implements Printable<T>{

    @Override
    public void print(T value) {
        System.out.println("Printing: "+ value);
    }
}

public class GenericInterfaceExample {
    public static void main(String[] args) {
        Printable<String> stringPrintable = new Printer<String>();
        stringPrintable.print("Working with Generic Interface.");
    }
}
