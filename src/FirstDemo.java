public class FirstDemo {

    int b=20;

    int addition(float a){
      //  int a=10;
    //    int c=a+b;
       // System.out.println("Addition : "+(a+b));
        return (int) (a+b);
    }



    void sub(){
        b=20;
    }

    public static void main(String[] args) {
        FirstDemo demo=new FirstDemo();
        System.out.println("addition : "+demo.addition((float) 10.5));
    }
}
