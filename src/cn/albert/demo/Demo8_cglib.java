package cn.albert.demo;

import cn.albert.domain.Person;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author albert.cui
 * @date 2018/10/1 22:45
 * 被代理对象未实现接口 jdk动态代理失效
 * Cglib代理,也叫作子类代理,它是在内存中构建一个子类对象从而实现对目标对象功能的扩展.
 */
public class Demo8_cglib<T> implements MethodInterceptor {
    private T target;

    public Demo8_cglib(T target) {
        this.target = target;
    }

    public static void main(String[] args) {
        Person person = new Person("albert", 15, 'X');
        Demo8_cglib<Person> demo8_cglib = new Demo8_cglib(person);
        Person proxyInstance = demo8_cglib.getProxyInstance();
        proxyInstance.Shit();
    }
    public T getProxyInstance() {
        //工具类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类
        return (T)enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("I am Coming ...");
        System.out.println("---------------");
        Object invoke = method.invoke(target, objects);
        System.out.println("---------------");
        System.out.println("Bye bye...");
        return invoke;
    }
}
