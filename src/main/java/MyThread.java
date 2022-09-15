public class MyThread extends Thread{


//    public MyThread(ThreadGroup group,
//                    String name) {
//    }

    @Override
    public void run() {
        try {
            while(!isInterrupted()) {

                System.out.println("Всем привет!" + " поток "+getName()+" запущен");
                Thread.sleep(1000);
            }
        } catch (InterruptedException err) {

        } finally{
            System.out.printf("%s завершен\n", getName());
        }
    }
}
