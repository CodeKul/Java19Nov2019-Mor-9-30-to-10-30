package keys;

public class StaticKeyDemo {

    static int a=10;
    int b=20;

    static void showData(){
        StaticKeyDemo demo=new StaticKeyDemo();
        System.out.println(demo.b);
        System.out.println("a : "+a);
        demo.display();
    }

    void display(){
        System.out.println("Non static method a : "+a);
        System.out.println("Non static method b : "+b);
    }

    static {
        System.out.println("Inside static block.");
    }

    public static void main(String[] args) {
        showData();
        System.out.println("Inside main method.");
    }

}
