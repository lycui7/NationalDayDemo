package cn.albert.demo;

/**
 * @author albert.cui
 * @date 2018/10/2 10:07
 * 一进程与线程的区别与联系？
 * 1.进程是作为拥有资源的基本单位，线程是作为调度和分配的基本单位
 * 2.进程之间可以并发执行，同一个进程的多个线程之间也可以并发执行
 * 3.进程是拥有资源的一个独立单位，线程不拥有资源，但可以访问隶属于进程的资源
 * 二并行与并发（Parallel && Concurrent）
 * 三线程的状态
 * 1.new -> runnable -> running -> dead
 * 2.调用yield() running -> runnable
 * 3.调用wait() running -> 等待blocked -> 调用notify() -> 锁定blocked ->同步锁被释放 -> runnable
 * 4.调用sleep() running -> blocked -> sleep()结束 -> runnable
 *
 */
public class Demo9_thread extends Thread{
    private int result = 1;
    @Override
    public synchronized void run() {
        while (result <=10) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getThreadGroup()+" "+this.getName()+" "+result++);
        }
    }

    public static void main(String[] args) {
        Thread thread = new Demo9_thread();
        thread.start();
        Thread thread1 = new Demo9_thread();
        thread1.start();
        new Thread();
    }
}
