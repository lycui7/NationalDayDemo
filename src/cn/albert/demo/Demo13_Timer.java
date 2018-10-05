package cn.albert.demo;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author albert.cui
 * @date 2018/10/5 11:09
 */
public class Demo13_Timer {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(new Date().toLocaleString());
            }
        },1000,1000);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(new Date().toLocaleString()+"haha");
            }
        },5000,1000);//定时器中的线程任务在延迟（delay）指定时间后，执行周期(period)为指定时间的定时器任务
    }
    /*
    阿里编码规约并不赞成这种用法
    多线程并行处理定时任务时，Timer运行多个TimeTask时，只要其中之一没有捕获抛出的异常，其它任务便会自动终止运行
     */
    /*
    //使用apache提供的excutorService来代替
     //org.apache.commons.lang3.concurrent.BasicThreadFactory
    ScheduledExecutorService executorService = new ScheduledThreadPoolExecutor(1,
        new BasicThreadFactory.Builder().namingPattern("example-schedule-pool-%d").daemon(true).build());
    executorService.scheduleAtFixedRate(new Runnable() {
        @Override
        public void run() {
            //do something
        }
    },initialDelay,period, TimeUnit.HOURS);
     */
}
