package keys;

public class CheckSuperKey extends SuperKeyDemo {
    int a=20;

    public CheckSuperKey() {
        System.out.println("child class constructor");
    }

    void show(){
        super.show();
        System.out.println("Inside check super key class : "+a);
    }


    public static void main(String[] args) {
        CheckSuperKey superKey=new CheckSuperKey();
        superKey.show();
    }


}
