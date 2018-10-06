package cn.albert.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author albert.cui
 * @date 2018/10/6 15:09
 * spring 提供一种机制，只要实现此接口BeanPostProcessor，
 * 并将实现类提供给spring容器，spring容器将自动执行，
 * 在初始化方法前执行before()，在初始化方法后执行after()
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("bean后处理器before " + s);
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(final Object o, String s) throws BeansException {
        System.out.println("bean后处理器after " + s);
        return Proxy.newProxyInstance(
                MyBeanPostProcessor.class.getClassLoader(),
                o.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        System.out.println("------开启事务"+o);

                        //执行目标方法
                        Object obj = method.invoke(o, args);

                        System.out.println("------提交事务"+o);
                        return obj;
                    }
                });

    }
}
