package inheritance;

public class CheckMultilevelInheritance extends Math {

    int div(int a,int b){
        return (a/b);
    }



    public static void main(String[] args) {
        CheckMultilevelInheritance inheritance=new CheckMultilevelInheritance();
        System.out.println("div ======>"+inheritance.div(50,20));
        System.out.println("add ======>"+inheritance.addition(50,20));

    }

}
