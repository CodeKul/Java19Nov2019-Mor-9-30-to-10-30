package inheritance;

public class Math extends Calculator {

    static int sub(int a,int b){
        return (a-b);
    }


    public static void main(String[] args) {
        Math math=new Math();
        System.out.println("sub ======>"+(sub(50,20)));
        System.out.println("add ======>"+math.addition(50,20));

    }

}
