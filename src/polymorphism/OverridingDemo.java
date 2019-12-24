package polymorphism;

public class OverridingDemo extends OverloadingDemo{

    private int addition(int a,int b){
        System.out.print("method from override demo class : ");
        return (a+b);
    }

    public static void main(String[] args) {

        OverridingDemo demo=new OverridingDemo();
        System.out.println(demo.addition(5,4));

    }

}
