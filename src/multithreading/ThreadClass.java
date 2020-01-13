package multithreading;

public class ThreadClass implements Runnable {

    public void run(){
        for (int i=0;i<5;i++){
            try {
                Thread.sleep(500);
                System.out.println("Hi");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadClass thread=new ThreadClass();
        Thread threadClass=new Thread(thread);

        threadClass.setName("A");
        threadClass.start();//A thread
        threadClass.join();

        ThreadClass thread1=new ThreadClass();
        Thread threadClass1=new Thread(thread1);
        threadClass1.setName("B");
        threadClass1.start();//B thread
        threadClass1.join();

        System.out.println("Main thread");//main thread




    }

}
