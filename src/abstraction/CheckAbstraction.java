package abstraction;

public class CheckAbstraction extends AbstractDemo implements InterfaceDemo {
    @Override
    void add() {
        System.out.println("Addition");
    }

    public static void main(String[] args) {
        CheckAbstraction abstraction=new CheckAbstraction();
        abstraction.add();
        abstraction.sub();
    }

    @Override
    public void div() {

    }
}
