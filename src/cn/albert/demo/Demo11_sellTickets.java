package cn.albert.demo;

/**
 * @author albert.cui
 * @date 2018/10/2 14:04
 * java.util.concurrent高集多线程控制类
 * 1.ThreadLocal
 * 2.AtomicInteger...
 * 3.ReentrantLock(可重入🔒) ReentrantReadWriteLock.ReadLock WriteLock
 * 4.容器类 BlockingQueue ConcurrentHashMap
 * 5.管理类 ThreadPoolExecutor
 */
public class Demo11_sellTickets implements Runnable{
    private final int ticketPrice = 10;
    private int tenCount = 1;
    private int twntyCount = 0;
    @Override
    public void run() {
        if(Thread.currentThread().getName().equals("唐三藏")) {
            sell(50);
        }else if(Thread.currentThread().getName().equals("孙悟空")) {
            sell(20);
        }else if(Thread.currentThread().getName().equals("猪八戒")) {
            sell(20);
        }else if(Thread.currentThread().getName().equals("沙僧")) {
            sell(10);
        }
    }
    public synchronized void sell(int money) {
        if(money == ticketPrice) {
            tenCount++;
            System.out.println(Thread.currentThread().getThreadGroup()+Thread.currentThread().getName()+"买了一张电影票");
            notifyAll();
        }else {
            if(money == 20) {
                while(tenCount < 1) {
                    System.out.println(Thread.currentThread().getThreadGroup()+Thread.currentThread().getName()+"20元找不开，等着");
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                tenCount--;
                twntyCount++;
                System.out.println(Thread.currentThread().getThreadGroup()+Thread.currentThread().getName()+"买了一张电影票");
                notifyAll();
            }else if (money == 50) {
                while(tenCount * 10 + twntyCount * 20 < 40) {
                    System.out.println(Thread.currentThread().getThreadGroup()+Thread.currentThread().getName()+"50元找不开，等着");
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                twntyCount -= 2;
                System.out.println(Thread.currentThread().getThreadGroup()+Thread.currentThread().getName()+"买了一张电影票");
                notifyAll();
            }
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Runnable runnable = new Demo11_sellTickets();
        ThreadGroup group1 = new ThreadGroup("Group1");
        ThreadGroup group2 = new ThreadGroup("Group2");
        ThreadGroup group3 = new ThreadGroup("Group3");
        ThreadGroup group4 = new ThreadGroup("Group4");
        new Thread(group1,runnable,"唐三藏").start();
        new Thread(group2,runnable,"孙悟空").start();
        new Thread(group3,runnable,"猪八戒").start();
        new Thread(group4,runnable,"沙僧").start();
    }
}
