package keys;

public class ThisKeyDemo {

    int a;
    int b;


    ThisKeyDemo(int a,int b){
        this();
        this.a=a;
        this.b=b;
        System.out.println("Inside constructor a : "+a+" b : "+b);
    }

    ThisKeyDemo(){
        this(10);
    }

    ThisKeyDemo(int a){
        System.out.println(a);
    }

    void showData(){
        System.out.println("a : "+a+" b : "+b);
        this.getData();
    }

    void getData(){

    }

    public static void main(String[] args) {
        ThisKeyDemo demo=new ThisKeyDemo(10,20);
        //demo.showData();
    }
}
