public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("�������� ������� �����");
        ThreadGroup myMainGroup = new ThreadGroup("my main group");

        for (int i = 0; i < 4; i++) {
            MyThread myThread = new MyThread();
            myThread.setName("������ " +i);
            Thread theard1 = new Thread(myMainGroup, myThread);
            theard1.start();
            System.out.println("�������� "+ myThread.getName());
        }

        Thread.sleep(5000);
        myMainGroup.interrupt();

        System.out.println("������� ����� ����������");
    }
}