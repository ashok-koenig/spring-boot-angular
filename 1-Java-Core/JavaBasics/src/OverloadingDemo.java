public class OverloadingDemo {
    int sum(int n1, int n2){
        return n1 + n2;
    }

    // Overloading with differnet number of parameters
    int sum(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }

    // Overloading with different type of parameters
    double sum(double n1, double n2){
        return n1 + n2;
    }

    public static void main(String[] args) {
        OverloadingDemo obj = new OverloadingDemo();
        System.out.println("Integer sum with 2 parameters: "+ obj.sum(10,20));
        System.out.println("Integer sum with 3 parameters: "+ obj.sum(10,20, 30));
        System.out.println("Double sum with 2 parameters: "+ obj.sum(10.34, 45.45));
    }
}
