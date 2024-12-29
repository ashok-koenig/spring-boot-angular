package exception_demos;

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        double n1 = 100;
        double n2 = 0;
        double result=0;
        String str = "Welcome";
//        String str =null;

        try(Scanner scanner = new Scanner(System.in)) {
            if(n2 == 0){
                throw new ArithmeticException("Please check the n2 value");
            }
            result = n1 / n2;
            if(str == null){
                throw new NullPointerException("String is null");
            }
            System.out.println("String length: "+ str.length());

        }catch (ArithmeticException e){
            System.err.println("ArithmeticException: "+ e.getMessage());
            n2 = 1;
            result = n1 / n2;
        }catch (NullPointerException e){
            System.err.println("NullPointerException: "+ e.getMessage());;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finally Block will execute always");
//            scanner.close();
        }

        System.out.println("Result is "+ result);

    }
}
