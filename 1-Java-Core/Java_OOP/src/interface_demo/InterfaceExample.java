package interface_demo;

interface Calculator{
    int add(int n1, int n2);
    int sub(int n1, int n2);
    default int mul(int n1, int n2){
        return n1 * n2;
    }
}

public class InterfaceExample implements Calculator{
    @Override
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    @Override
    public int sub(int n1, int n2) {
        return n1-n2;
    }

    public static void main(String[] args) {
        Calculator calc = new InterfaceExample();
        System.out.println("Addition: "+ calc.add(10,20));
    }
}
