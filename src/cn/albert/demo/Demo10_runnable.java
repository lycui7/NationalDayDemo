package cn.albert.demo;

/**
 * @author albert.cui
 * @date 2018/10/2 10:15
 */
public class Demo10_runnable implements  Runnable{
    private int result = 1;
    @Override
    public void run() {
        while (result <=10) {
            System.out.println(result++);
        }
    }

    public static void main(String[] args) {
        Runnable runnable = new Demo10_runnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
