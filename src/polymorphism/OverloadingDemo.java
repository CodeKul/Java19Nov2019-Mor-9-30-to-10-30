package polymorphism;

public class OverloadingDemo {

    OverloadingDemo(int a){

    }

    OverloadingDemo(int a,int b){

    }

    private int addition(int a,int b){
        System.out.print("method from overload demo class : ");
        return (a+b);
    }

    private int addition(int a,int b,int c){
        return (a+b+c);
    }


    public static void main(String[] args) {

        OverloadingDemo demo=new OverloadingDemo(1,3);
        System.out.println(demo.addition(2,3));

    }

}
