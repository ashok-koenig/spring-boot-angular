public class HelloJNI {
    static {
        System.loadLibrary("hello");
    }

    private native void sayHello();

    public static void main(String[] args) {
        HelloJNI obj = new HelloJNI();
        obj.sayHello();
    }
}
