package cn.albert.demo;

import cn.albert.service.IUserDao;
import cn.albert.service.impl.IUserDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Objects;

/**
 * @author albert.cui
 * @date 2018/10/1 21:57
 */
public class Demo7_dynamicProxy<T> {
    private   T target;
    public Demo7_dynamicProxy( T target) {
        this.target = target;
    }

    public static void main(String[] args) {
        //静态代理
        /*静态代理在使用时,需要定义接口或者父类,被代理对象与代理对象一起实现相同的接口或者是继承相同父类
        缺点：因为代理对象需要与目标对象实现一样的接口,所以会有很多代理类,类太多.同时,一旦接口增加方法,目标对象与代理对象都要维护*/
        //JDK动态代理(针对接口做代理)
        IUserDao iUserDao = new IUserDaoImpl();
        Demo7_dynamicProxy<IUserDao> demo7_dynamicProxy = new Demo7_dynamicProxy<IUserDao>(iUserDao);
        IUserDao proxyInstance = demo7_dynamicProxy.getProxyInstance();
        proxyInstance.sayHello("崔璐瑶");
        //Cglib代理
        //Demo8
    }
    public T getProxyInstance() {
        return (T)Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("hello everyone");
                        Object invoke = method.invoke(target, args);
                        System.out.println("bye bye...");
                        return invoke;
                    }
                });
    }
}
