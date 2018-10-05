package cn.albert.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author albert.cui
 * @date 2018/10/5 14:14
 * 监听机制：事件，事件源，监听器，注册监听
 * 这是一个自定义监听器
 * 还需要注册监听器（web.xml）
 */
public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContext 初始化...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContext 销毁...");
    }
}
