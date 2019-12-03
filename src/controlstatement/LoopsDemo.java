package controlstatement;

public class LoopsDemo {

    private void forloopDemo(){

        for (int i=0;i<3;i++){
            System.out.println(i);
        }

    }

    private void whileLoopDemo(){
        int i=0;
        while (i<3){
            System.out.println(i);
            i++;
        }

    }

    private void doWhileDemo(){
        int i=3;
        do {
            System.out.println(i);
            i++;
        }while (i<3);
        System.out.println("after do while : "+i);
    }

    public static void main(String[] args) {
        LoopsDemo demo=new LoopsDemo();
        demo.doWhileDemo();
    }

}
