package cn.albert.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * @author albert.cui
 * @date 2018/10/5 14:37
 */
public class MyHttpServletRequestListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        System.out.println(servletRequestEvent.getServletContext().toString()+"销毁...");
    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        System.out.println(servletRequestEvent.getServletContext().toString()+"初始化...");
    }
}
