package exceptionhandling;

import java.io.IOException;

public class ExceptionHandling {

    void checkArithmaticException() throws IOException {
        try {
            int a = 0, result = 0;
            result = 10 / a;
            System.out.println("result = " + result);
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println(restOfCode());
    }


    void checkNullpointerException(){
        try {
            String name=null;
            System.out.println(name.length());
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Clean up activity");
            throw  new ArithmeticException("Arithmetic exception");
        }
       // System.out.println(restOfCode());
    }


    String restOfCode(){
        return "rest of the code";
    }

    public static void main(String[] args) {
        ExceptionHandling exceptionHandling=new ExceptionHandling();
        exceptionHandling.checkNullpointerException();
    }

}
