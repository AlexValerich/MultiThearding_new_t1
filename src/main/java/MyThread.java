public class MyThread extends Thread{


//    public MyThread(ThreadGroup group,
//                    String name) {
//    }

    @Override
    public void run() {
        try {
            while(!isInterrupted()) {

                System.out.println("���� ������!" + " ����� "+getName()+" �������");
                Thread.sleep(1000);
            }
        } catch (InterruptedException err) {

        } finally{
            System.out.printf("%s ��������\n", getName());
        }
    }
}
